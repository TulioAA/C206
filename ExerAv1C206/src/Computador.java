public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;
    HardwareBasico hardwareBasico;

    public Computador() {
        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico();
    }

    void mostraPCConfigs(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Preço: R$"+ this.preco);
        System.out.println(this.hardwareBasico.nome);
        System.out.println(this.hardwareBasico.capacidade+"Gb de HD");
        System.out.println(this.sistemaOperacional.nome+" de "+this.sistemaOperacional.tipo+ "bits");
        System.out.println("Acompanha "+this.memoriaUSB.nome+" de "+this.memoriaUSB.capacidade+"GB");
    }
    void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }


}
