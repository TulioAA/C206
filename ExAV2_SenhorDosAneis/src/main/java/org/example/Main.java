package org.example;

public class Main {
    public static void main(String[] args) {
        TerraMedia terra = new TerraMedia();

        Arma ar1 = new Arma();
        ar1.setNomeArma("MinhaNota100");
        ar1.setMagica(true);
        Habitante anao = new Anao("Joãozinho", 30, 500, ar1);
        terra.addHabitante(anao);

        Arma ar2 = new Arma();
        ar2.setMagica(true);
        ar2.setNomeArma("Nota100");
        Habitante elfo = new Elfo("Julia", 20, 200, ar2);
        terra.addHabitante(elfo);

        Arma ar3 = new Arma();
        ar3.setNomeArma("Cemzinho");
        ar3.setMagica(true);
        Habitante mago = new Mago("Ter", 40, 300, ar3);
        terra.addHabitante(mago);

        terra.listarHabitantes();
    }
}