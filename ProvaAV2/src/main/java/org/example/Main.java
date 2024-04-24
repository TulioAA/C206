package org.example;

public class Main {
    public static void main(String[] args) {
        Exercito exercitos = new Exercito();

        ItemEspecial itens1 = new ItemEspecial();
        itens1.setTipo("Remedio");
        MedicoMilitar medicos = new MedicoMilitar(itens1,"Tião", 0000,10,15);
        exercitos.addSoldado(medicos);

        ItemEspecial itens2 = new ItemEspecial();
        itens2.setTipo("www");
        Sargento sargentos = new Sargento(itens2,"Carlinhos", 48949,"matar",500);
        exercitos.addSoldado(sargentos);

        ItemEspecial itens3 = new ItemEspecial();
        itens3.setTipo("Cemzinho");
        Oficial oficials = new Oficial(itens3,"Joãozinho", 9485985,"alto");
        exercitos.addSoldado(oficials);

        exercitos.mostraInfo();
    }
}