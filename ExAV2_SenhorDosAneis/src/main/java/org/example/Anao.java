package org.example;

public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;
    public void setReino(String reino){
        this.reino = reino;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public Anao(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: " +this.altura);
        System.out.println("Reino: " +this.reino);
    }
    @Override
    public void minerar() {
        System.out.println("O anão está mineirando");
    }
}