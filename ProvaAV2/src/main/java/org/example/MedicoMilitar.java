package org.example;

public class MedicoMilitar extends Soldado implements Curar {
    private int anosEdperiencia;
    private int capacidadeEmergencia;

    public MedicoMilitar(ItemEspecial itens,String nome, long cpf, int anosEdperiencia, int capacidadeEmergencia) {
        super(itens, nome, cpf);
        this.anosEdperiencia = anosEdperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void curar() {
        if(this.itens!=null)
            this.capacidadeEmergencia = this.capacidadeEmergencia+100;
        if(this.capacidadeEmergencia>=920){
            System.out.println(this.nome + " curou");
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Experiencia"+this.anosEdperiencia);
        System.out.println("Emergencia"+this.capacidadeEmergencia);
    }

    @Override
    public void usandoItem() {
        super.usandoItem();
    }
}
