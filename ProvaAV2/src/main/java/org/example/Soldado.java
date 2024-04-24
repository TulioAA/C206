package org.example;

public abstract class Soldado {
    ItemEspecial itens;
    public static int qtdSoldado=0;
    protected String nome;
    protected long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Soldado(ItemEspecial itens, String nomes, long cpf) {
        qtdSoldado++;
        this.itens = itens;
        this.nome = nomes;
        this.cpf = cpf;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("A quantidade de soldados são "+ qtdSoldado);
    }
    public void usandoItem(){
        if(this.itens!=null){
        System.out.println(this.nome+" utilizando item especial");
        }
        else{
            System.out.println(this.nome+" não tem item especial para utilizar");
        }
    }

}
