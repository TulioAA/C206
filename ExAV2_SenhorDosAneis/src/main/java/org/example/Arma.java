package org.example;

public class Arma {
    private String nomeArma;
    private boolean magica;
    public String getNomeArma(){
        return this.nomeArma;
    }
    public void setNomeArma(String nome){
        this.nomeArma = nome;
    }
    public boolean getMagica(){
        return this.magica;
    }
    public void setMagica(boolean magics){
        this.magica = magics;
    }
}
