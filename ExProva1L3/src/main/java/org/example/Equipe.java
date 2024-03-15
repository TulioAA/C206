package org.example;

public class Equipe {
    String capitao;
    Heroi[] heroi = new Heroi[10];

    void adicionarHeroi(Heroi herois){
        for (int i = 0; i < heroi.length; i++) {
            if(heroi[i] == null){
                heroi[i] = herois;
                System.out.println("O heroi foi adicionado");
                break;
            }
        }
    }
    void mostrarInfo(){
        System.out.println("Mostrando nome do capitão: "+ this.capitao);
        for (int i = 0; i < heroi.length; i++) {
            if(heroi[i] != null)
            {
                System.out.println("O nome do heroi é: "+ heroi[i].nome);
                System.out.println("O poder do heroi é: "+ heroi[i].poder);
                System.out.println("O heroi voa: "+ heroi[i].poderVoar);
            }

        }

    }
    void mostrarInfoForte(){
        float t=0;
        int j=0;
        for (int i = 0; i < heroi.length; i++) {
            if(heroi[i]!= null)
                if(heroi[i].poder>t) {
                    t = heroi[i].poder;
                    j=i;
                }
        }
        System.out.println("O heroi mais forte é: "+heroi[j].nome);
    }
    int calculaVoadores(){
        int t=0;
        int j=0;
        int h;
        for (int i = 0; i < heroi.length; i++) {
            if(heroi[i]!=null) {
                t++;
                if(heroi[i].poderVoar)
                    j++;
            }
        }
        h=(j*t)/100;
        return h;
    }
}
