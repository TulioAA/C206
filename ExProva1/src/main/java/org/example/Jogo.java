package org.example;
public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    void mostraInfo(){
        System.out.println("Mostrando nome do jogo: "+ this.nome);
        System.out.println("Mostrando genero: "+ this.genero);
        System.out.println("Mostrando preço: "+ this.preco);
        System.out.println("Mostrando DLC: "+ this.dlc);
    }
}
