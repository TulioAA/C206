package org.example;

public class Oficial extends Soldado implements Defesa {
        private String patente;

    public Oficial(ItemEspecial itens,String nome, long cpf, String patente) {
        super(itens, nome, cpf);
        this.patente = patente;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente"+this.patente);
    }
    @Override
    public void defender() {
        if(this.itens!=null){
            System.out.println(super.nome() + " conseguiu se defender");
        } else
            System.out.println(super.nome() + " não se defendeu");
    }
    @Override
    public void usandoItem() {
        super.usandoItem();
    }
}
