package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rapper[] rappers = new Rapper[10];
        Scanner cin = new Scanner(System.in);

        Arena arena1 = new Arena();
        arena1.nome = "MinhaNota100";
        arena1.lugar = "Praça";

        boolean flag=true;

        while(flag)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da arena:");
            System.out.println("1 - Adicionar um rapper.");
            System.out.println("2 - Mostrar as informações");
            System.out.println("3 - Nome dos rappers que tem microfone dourado");
            System.out.println("4 - Rapper ganhador e o perdedor");
            System.out.println("5- Sair do menu");

            int op = cin.nextInt();
            switch (op) {
                case 1:
                    cin.nextLine();
                    System.out.println("Entre com o nome do rapper:");
                    String nome = cin.nextLine();
                    System.out.println("Entre com a nota do rapper entre 0 e 10");
                    int nota = 0;
                    boolean tr = true;
                    while (tr) {
                        int nt = cin.nextInt();
                        if (nt <= 10) {
                            if (nt >= 0) {
                                nota = nt;
                                tr = false;
                            }
                            else
                                System.out.println("Digite um valor valido");

                        }
                        else
                            System.out.println("Digite um valor valido");
                    }
                    System.out.println("Entre com a idade do rapper:");
                    int idade = cin.nextInt();
                    System.out.println("Digite o numero de qual é o microfone que ele usa?");
                    System.out.println("1-Dourado");
                    System.out.println("2-Madeira");
                    System.out.println("3-Plastico");
                    String micro= null;
                    boolean qw=true;
                    while(qw) {
                        int num = cin.nextInt();
                        switch (num) {
                            case (1):
                                micro = "Dourado";
                                qw=false;
                                break;
                            case (2):
                                micro = "Madeira";
                                qw=false;
                                break;
                            case (3):
                                micro = "Plastico";
                                qw=false;
                                break;
                            default:
                                System.out.println("Digite um valor válido!");

                        }
                    }
                    Rapper rap1= new Rapper(nome, nota, idade, micro);
                    arena1.addrapper(rap1);
                    break;
                case 2:
                    arena1.mostraInfo();
                    break;
                case 3:
                    arena1.microfoneDou();
                    break;
                case 4:
                    arena1.ranking();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    System.out.println("----------------------------");
                    break;
            }
        }
    }
}