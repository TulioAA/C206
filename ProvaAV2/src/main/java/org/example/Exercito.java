package org.example;

public class Exercito {
    private Soldado soldados[] = new Soldado[10];
    private String nome;
    public void addSoldado(Soldado soldado){
        for(int i=0 ; i<soldados.length; i++){
            if(soldados[i]==null){
                soldados[i] = soldado;
                break;
            }
        }
    }
    public void mostraInfo(){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i]!=null) {
                if (soldados[i] instanceof Sargento) {
                    Sargento sargentos = (Sargento) soldados[i];
                    soldados[i].mostraInfo();
                    sargentos.defender();

                }
                else if (soldados[i] instanceof Oficial) {
                    Oficial oficiais = (Oficial) soldados[i];
                    soldados[i].mostraInfo();
                    oficiais.mostraInfo();

                }
                else if (soldados[i] instanceof MedicoMilitar) {
                    MedicoMilitar medicos = (MedicoMilitar) soldados[i];
                    soldados[i].mostraInfo();
                    medicos.curar();
                }
            }
        }
    }
}
