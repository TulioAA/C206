package org.example;

public class Plataforma {
    //atributos
    String nomeplat;
    Serie[] series = new Serie[10];

    void mostraInfo(){
        System.out.println("Nome da plataforma: "+this.nomeplat);
        System.out.println("Informações da série: ");
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null)
                series[i].mostraInfo();

        }
    }
    void addSerie(Serie serie){
        for (int i = 0; i < series.length; i++) {
            if(series[i]==null){
                series[i] = serie;
                System.out.println("Serie adicionada");
                break;
            }

        }
    }
    String serieMaislongaFinalizada(){
        int t=0;
        int aux=0;
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null)
                if(series[i].finalizada)
                    if(series[i].temporadas>t) {
                        t = series[i].temporadas;
                        aux=i;
                    }
        }
        return series[aux].nome;
    }
    void mediaPorcentagem(){
        double porcentagem, media, soma=0;
        int total=0;
        int trestemp=0;
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null) {
                total++;
                if (series[i].temporadas >= 3) {
                    soma = soma + series[i].nota;
                    trestemp++;
                }
            }
        }
        porcentagem = (float) (trestemp/total)*100;
        media = soma/trestemp;
        System.out.println("A porcentagem é: "+porcentagem+"%");
        System.out.println("A media das notas: "+media);
    }
}
