package org.example;

public class Sargento extends Soldado implements Defesa{
    private String especializacao;
    private int experienciaCombate;
    public Sargento(ItemEspecial itens, String nome, long cpf, String especializacoes, int experienciaCombate) {
        super(itens, nome, cpf);
        this.especializacao = especializacoes;
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especializacao"+this.especializacao);
        System.out.println("Experiencia"+this.experienciaCombate);
    }
    @Override
    public void defender() {
        if(this.itens!=null)
            this.experienciaCombate = this.experienciaCombate + 300;
        if(this.experienciaCombate>=650){
            System.out.println(super.nome + " conseguiu se defender");
        }
        else
            System.out.println(super.nome + " não se defendeu");
    }
    @Override
    public void usandoItem() {
        super.usandoItem();
    }
}
