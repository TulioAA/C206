package org.example;

public class Locadora {
    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar;
    Carro[] carros = new Carro[10];
    void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.CNPJ);
        System.out.println(this.endereco);
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]!=null)
                carros[i].mostraInfo();
        }
    }
    void adicionarCarro(Carro carro){
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]==null){
                carros[i] = carro;
                System.out.println("Carro adicionada");
                break;
            }
        }

    }
    void alugarCarro(int index){
        System.out.println("Os carros començão a contar apartir do zero");
        if(carros[index]!=null){
            if(carros[index].alugado==false) {
                carros[index].alugado = true;
                System.out.println("Carro alugado");
            }
            else
                System.out.println("Esse carro já está alugado");
        }
        else
            System.out.println("Não tem essa numeração de carro");

    }
    float contarCarrosParaAlugar(){
        float t;
        float total=0;
        float alugadostotal=0;
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]!=null) {
                total++;
                if (carros[i].alugado)
                    alugadostotal++;
            }
        }
        t=((alugadostotal/total)*100);
        return t;
    }
}
