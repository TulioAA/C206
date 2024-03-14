package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int entrada;
        boolean flag = true;
        Plataforma plataforma = new Plataforma();
        Scanner sc = new Scanner(System.in);
        plataforma.nome = "Deu trabalho";
        plataforma.criador = "Já estou louco";

        while(flag){
            System.out.println("Bem-vindo ao menu de informações");
            System.out.println("1 Adicionar um jogo na plataforma");
            System.out.println("2 Mostrar as informações da plataforma e seus jogos");
            System.out.println("3 Mostrar o nome do jogo mais caro e do mais barato cadastrados");
            System.out.println("4 Calcular quantos jogos possuem dlc");
            entrada = sc.nextInt();
            switch (entrada) {
                case (1):
                    sc.nextLine();
                    System.out.println("Entre com o nome do jogo");
                    String nome = sc.nextLine();

                    System.out.println("Entre com o genero do jogo");
                    String genero = sc.nextLine();

                    System.out.println("Entre com o preço do jogo");
                    int preco = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Entre com o dlc do jogo");
                    boolean dlc = sc.nextBoolean();

                    Jogo jogos = new Jogo(nome, genero, preco, dlc);
                    plataforma.adicionarJogo(jogos);
                    break;

                case (2):
                    plataforma.mostraInfo();
                    break;
                case (3):
                    plataforma.mostraMaisCaroBarato();
                    break;
                case (4):
                    plataforma.calculaDlc();
                    break;
            }
        }

    }
}