package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Serie[] series = new Serie[100];
        Scanner cin = new Scanner(System.in);

        Plataforma plat1 = new Plataforma();
        plat1.nomeplat = "Netflix";
        boolean flag=true;

        while(flag)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da Plataforma:");
            System.out.println("1 - Adicionar uma serie.");
            System.out.println("2 - Mostrar as informações serie");
            System.out.println("3 - Nome da serie com maior temporada");
            System.out.println("4 - Porcentagem dos produtos com temporadas maior ou igual a 3 e a media. ");
            System.out.println("5- Sair do menu");

            int op = cin.nextInt();
            switch (op){
                case 1:
                    System.out.println("Entre com o nome da serie:");
                    cin.nextLine();
                    String nome = cin.nextLine();
                    System.out.println("Entre com a nota da serie:");
                    int nota = cin.nextInt();
                    cin.nextLine();
                    System.out.println("Entre com a quantidade de temporadas:");
                    int qtd = cin.nextInt();
                    System.out.println("A serie se encontra finalizada?");
                    boolean fim = cin.nextBoolean();
                    System.out.println("Entre com o nome do diretor:");
                    cin.nextLine();
                    String nomedire = cin.nextLine();

                    Serie s1= new Serie(nome, nota, qtd, fim, nomedire);
                    plat1.addSerie(s1);
                    break;
                case 2:
                    plat1.mostraInfo();
                    break;
                case 3:
                    System.out.println(plat1.serieMaislongaFinalizada());
                    break;
                case 4:
                    plat1.mediaPorcentagem();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}