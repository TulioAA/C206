package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locadora locadoras = new Locadora();
        Scanner entrada = new Scanner(System.in);
        Carro[] carros = new Carro[10];
        int op;
        boolean flag = true;

        locadoras.nome = "TLA";
        locadoras.endereco = "Santa Rita";
        locadoras.CNPJ = "123224134" ;

        while(flag){
            System.out.println("Bem-vindo ao menu de informações");
            System.out.println("1 Adicionar um carro em uma locadora");
            System.out.println("2 Mostrar informações da loucadora e seus carros");
            System.out.println("3 Calcular a porcentagem de carros que estão disponíveis para alugar");
            System.out.println("4 Alugar um carro");
            System.out.println("5 Sair");
            op=entrada.nextInt();
            switch (op){
                case (1):
                    entrada.nextLine();
                    System.out.println("Entre com o modelo do carro:");
                    String modelo = entrada.nextLine();
                    System.out.println("Entre com a cor do carro:");
                    String cor = entrada.nextLine();
                    System.out.println("O carro é alugado?");
                    boolean alugado = entrada.nextBoolean();
                    System.out.println("Qual a velocidade maxima do carro?");
                    float velocidade = entrada.nextFloat();

                    Carro s1= new Carro(modelo, cor, alugado, velocidade);
                    locadoras.adicionarCarro(s1);
                    break;
                case (2):
                    locadoras.mostraInfo();
                    break;
                case (3):
                    System.out.println(locadoras.contarCarrosParaAlugar());
                    break;
                case (4):
                    System.out.println("Qual o numero do carro que deseja alugar?");
                    int numero = entrada.nextInt();
                    locadoras.alugarCarro(numero);
                    break;
                case (5):
                    flag=false;
                    break;

            }
        }
    }
}