package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int op;

        while(flag){
            System.out.println("Bem-vindo ao menu de informações");
            System.out.println("1 Adicionar novo herói");
            System.out.println("2 Mostrar as informações da equipe e de seus heróis");
            System.out.println("3 Mostrar o herói mais forte, de acordo com seu poder");
            System.out.println("4 Calcular a porcentagem de heróis na equipe que podem voar");

            op=input.nextInt();
            switch (op) {
                case (1):
                    input.nextLine();
                    System.out.println("Digite o nome do heroi: ");
                    String nome = input.nextLine();

                    System.out.println("Digite o poder do heroi: ");
                    float poder = input.nextFloat();

                    System.out.println("O heroi voa: ");
                    boolean poderVoar = input.nextBoolean();

                    Heroi heroi = new Heroi(nome, poder, poderVoar);
                    equipe.adicionarHeroi(heroi);
                    break;
                case (2):
                    equipe.mostrarInfo();
                    break;
                case (3):
                    equipe.mostrarInfoForte();
                    break;
                case (4):
                    equipe.calculaVoadores();
                    break;
            }

        }
    }
}