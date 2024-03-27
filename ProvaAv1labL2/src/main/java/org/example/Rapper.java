package org.example;
public class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone m1;

    public Rapper(String nome, float nota, int idade, String nomemate) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        m1 = new Microfone(nomemate);
    }

    void mostraInfo(){
        System.out.println("Nome do rapper: "+this.nome);
        System.out.println("Nota do rapper: "+this.nota);
        System.out.println("idade do rapper: "+this.idade);
        System.out.println("Tipo de microfone: "+this.m1.material);
    }
}
