import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        int np3, npa;
        System.out.println("Digiti a nota NPA: ");
        npa= entrada.nextInt();
            if (npa >= 60)
                System.out.println("Deu bom");
            else {
                System.out.println("Fazer np3");
                System.out.println("Digite a nota NP3");
                np3 = entrada.nextInt();
                if (((np3 + npa) / 2) >= 50)
                    System.out.println("Passou");
                else
                    System.out.println("Reprovou");
            }
            entrada.close();
            }

    }