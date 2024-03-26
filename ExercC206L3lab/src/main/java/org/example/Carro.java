package org.example;

public class Carro {
    String modelo;
    String cor;
    boolean alugado;
    Motor m1;

    public Carro(String modelo, String cor, boolean alugado, float velocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
        m1 = new Motor(velocidade);
    }

    void mostraInfo(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.alugado);
        m1.mostraInfo();
    }
}
