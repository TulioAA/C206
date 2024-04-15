package org.example;
public class Mago extends Habitante implements Feitico,Cura{
    private String cor;
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Mago(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }
    @Override
    public void lancarFeitico(){
        this.energia = this.energia * 0.9f;
        System.out.println("O mago lançou um feitiço");
    }
    @Override
    public void curar(){
        this.energia = this.energia * 1.15f;
        System.out.println("Herói foi curado");
    }
}