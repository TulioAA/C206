package org.example;
public class Arena {
    String nome;
    String lugar;
    Rapper[] rapper = new Rapper[10];
    void addrapper(Rapper rapper1){
        for (int i = 0; i < rapper.length; i++) {
            if(rapper[i]==null){
                rapper[i] = rapper1;
                System.out.println("Rapper adicionada");
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println("Nome da arena: "+this.nome);
        System.out.println("Lugar da arena: "+this.lugar);
        System.out.println("Informações dos rappers");
        for (int i = 0; i < rapper.length; i++) {
            if(rapper[i]!=null)
                rapper[i].mostraInfo();
        }
    }
    void microfoneDou(){
        for (int i = 0; i < rapper.length; i++) {
            if (rapper[i]!=null)
                if (rapper[i].m1.material.equals("Dourado"))
                    System.out.println(rapper[i].nome);
        }
    }
    void ranking(){
        float t=0f;
        float men=99999f;
        int aux=0;
        int aux1=0;
        for (int i = 0; i < rapper.length; i++) {
            if(rapper[i]!=null) {
                if (rapper[i].nota > t) {
                    t = rapper[i].nota;
                    aux = i;
                }
                if(rapper[i].nota<men){
                    men = rapper[i].nota;
                    aux1 = i;
                }
            }
        }
        System.out.println("O ganhador é "+rapper[aux].nome);
        System.out.println("O que ficou em ultimo lugar é "+rapper[aux1].nome);
    }
}
