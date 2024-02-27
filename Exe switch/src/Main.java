import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número de alunos matriculados");
        numero= entrada.nextInt();
        switch (numero) {
            case 10, 20:
                System.out.println("Aula será ministrada na sala I-16");
                break;
            case 30:
                System.out.println("Aula será ministrada na sala I-22");
                break;
            default:
                System.out.println("Número incorreto ");
                break;
        }
    }
}