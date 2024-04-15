package org.example;

public abstract class Habitante {
    Arma arma;
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    public Habitante(String nome, int idade, float energia, Arma arma){
        contador++;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.arma = arma;
        this.id = contador;
    }
    public void atacar(){
        if(this.arma.getMagica()){
            this.energia -= 20;
        }
        else{
            this.energia -= 10;
        }
        System.out.println("O herói atacou");
        System.out.println("Nome da Arma: "+arma.getNomeArma());
        System.out.println("Mágica: "+arma.getMagica());
    }
    public void mostraInfo(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Id: " +this.id);
        System.out.println("Idade: " +this.idade);
        System.out.println("Energia: " +this.energia);
    }
}