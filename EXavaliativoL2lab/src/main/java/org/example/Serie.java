package org.example;

public class Serie {
    //atributos da serie
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor d1;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomediretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;

        d1 = new Diretor(nomediretor);
    }

    public void mostraInfo(){
        System.out.println("Informações da série");
        System.out.println("Nome da série: "+this.nome);
        System.out.println("Nota da série: "+this.nota);
        System.out.println("Temporadas da série: "+this.temporadas);
        System.out.println("Série finalizada: "+this.finalizada);
        System.out.println("Nome do diretor: "+this.d1.nome);
    }

}
