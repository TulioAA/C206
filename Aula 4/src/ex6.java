import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numero, numad;
        numero = rand.nextInt(10)+1;//numero aleatorio entre 1 e 10
        do {
            System.out.println("Qual o número estou pensando ");
            numad= entrada.nextInt();
            if(numad == numero)
                System.out.println("Você acretou");
            else if (numad > numero)
                System.out.println("Seu número é maior que o número gerado");
            else
                System.out.println("Seu número é menor que o número gerado");
        }while(numad!=numero);
        entrada.close();
    }
}
