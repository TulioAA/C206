package org.example;

public class TerraMedia {
    private Habitante herois[] = new Habitante[10];
    public void addHabitante(Habitante habitante){
        for(int i=0 ; i<herois.length; i++){
            if(herois[i]==null){
                herois[i] = habitante;
                break;
            }
        }
    }
    public void listarHabitantes(){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i]!=null) {
                if (herois[i] instanceof Anao) {
                    Anao anao = (Anao) herois[i];
                    anao.setAltura(1.00f);
                    anao.setReino("Reino da Nota 100");
                    herois[i].mostraInfo();
                    anao.minerar();
                    anao.atacar();

                }
                else if (herois[i] instanceof Elfo) {
                    Elfo elfo = (Elfo) herois[i];
                    elfo.setTribo("Tribo Nota 100");
                    herois[i].mostraInfo();
                    elfo.atacar();
                    elfo.curar();
                    elfo.viajar();

                }
                else if (herois[i] instanceof Mago) {
                    Mago mago = (Mago) herois[i];
                    mago.setCor("Azul");
                    herois[i].mostraInfo();
                    mago.lancarFeitico();
                    mago.atacar();
                    mago.curar();
                }
            }
        }
    }
}
