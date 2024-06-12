package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Arquivo a = new Arquivo();
        int entrada;

        ArrayList<Aluno> alunosi = a.ler();

        while (flag) {
            System.out.println("Bem-vindo ao menu de informações");
            System.out.println("1 Cadastrar o aluno");
            System.out.println("2 Listar os alunos");
            System.out.println("3 Ordenar em ordem crescente pela média");
            System.out.println("4 Mostrar a  quantidade de jogadores existentes de cada curso");
            System.out.println("5 Sair");

            entrada = sc.nextInt();
            switch (entrada) {
                case (1):
                    sc.nextLine();
                    System.out.println("Entre com o nome");
                    String nome = sc.nextLine();

                    System.out.println("Entre com a matricula");
                    int matricula = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Entre com o curso");
                    System.out.println("Computação");
                    System.out.println("Software");
                    System.out.println("Telecomunicações");
                    String curso = sc.nextLine();

                    System.out.println("Entre com a media");
                    float media = sc.nextFloat();

                    Aluno A1 = new Aluno(nome, matricula, curso, media);
                    a.escrever(A1);
                    break;

                case (2):

                    for (int i = 0; i < alunosi.size(); i++){
                        System.out.println("Nome: " + alunosi.get(i).getNome());
                        System.out.println("Matricula: " + alunosi.get(i).getMatricula());
                        System.out.println("Curso: " + alunosi.get(i).getCurso());
                        System.out.println("Media: " + alunosi.get(i).getMedia());
                    }
                    break;

                    case (3):
                        ArrayList<Aluno> alun = a.ler();
                        Collections.sort(alun);
                        for (int i = 0; i < alun.size(); i++){
                            System.out.println("Nome: " + alun.get(i).getNome());
                            System.out.println("Matricula: " + alun.get(i).getMatricula());
                            System.out.println("Curso: " + alun.get(i).getCurso());
                            System.out.println("Media: " + alun.get(i).getMedia());
                        }
                        break;

                    case (4):
                        int Computacao = 0;
                        int Software = 0;
                        int Telecomunicacoes = 0;
                        ArrayList<Aluno> alunoss = a.ler();
                        for (int i = 0; i < alunoss.size(); i++) {
                            if(alunoss.get(i).getCurso().equals("Computação")){
                                Computacao++;
                            } else if (alunoss.get(i).getCurso().equals("Software")) {
                                Software++;
                            } else if (alunoss.get(i).getCurso().equals("Telecomunicações")) {
                                Telecomunicacoes++;
                            }
                        }
                        System.out.println("A quantidade de jogadores são: "+ Computacao);
                        System.out.println("A quantidade de jogadores são: "+Software);
                        System.out.println("A quantidade de jogadores são: "+ Telecomunicacoes);
                        break;

                    case (5):
                        flag = false;
                        break;

            }
        }
    }
}