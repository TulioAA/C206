import java.util.Random;
import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numero, numad;
        numero = rand.nextInt(10)+1;//numero aleatorio entre 1 e 10
        do {
            System.out.println("Qual o número estou pensando ");
            numad= entrada.nextInt();
            if(numad!= numero)
                System.out.println("Errou");
        }while(numad!=numero);
        System.out.println("Você acretou");
        entrada.close();
    }
}