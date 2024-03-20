import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op;
        String nomee;
        boolean flag = true;
        Cliente cliente = new Cliente();

        MemoriaUSB memoriaUSB1= new MemoriaUSB();
        MemoriaUSB memoriaUSB2= new MemoriaUSB();
        MemoriaUSB memoriaUSB3= new MemoriaUSB();
        Computador[] computador = new Computador[3];

        Computador computador1= new Computador();
        computador1.marca = "Positivo";
        computador1.preco = 3300f;
        computador1.hardwareBasico.nome = "Pentium Core i3(2200 MHZ) 8Gb de memória ram";
        computador1.hardwareBasico.capacidade = 500f;
        computador1.sistemaOperacional.nome = "Sistema operacional linux ubunto";
        computador1.sistemaOperacional.tipo = 32;
        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB1.capacidade = 16;
        computador1.addMemoriaUSB(memoriaUSB1);

        Computador computador2= new Computador();
        computador2.marca = "Acer";
        computador2.preco = 8800f;
        computador2.hardwareBasico.nome = "Pentium Core i5(3370 MHZ) 16Gb de memória ram";
        computador2.hardwareBasico.capacidade = 1000;
        computador2.sistemaOperacional.nome = "Sistema operacional windows 8";
        computador2.sistemaOperacional.tipo = 64;
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB2.capacidade = 32;
        computador2.addMemoriaUSB(memoriaUSB2);

        Computador computador3= new Computador();
        computador3.marca = "Vaio";
        computador3.preco = 4800f;
        computador3.hardwareBasico.nome = "Pentium Core i7(4500 MHZ) 32Gb de memória ram";
        computador3.hardwareBasico.capacidade = 2000;
        computador3.sistemaOperacional.nome = "Sistema operacional windows 10";
        computador3.sistemaOperacional.tipo = 64;
        memoriaUSB3.nome = "HD externo";
        memoriaUSB3.capacidade = 1000;
        computador3.addMemoriaUSB(memoriaUSB3);
        System.out.println("Qual é o seu nome?");
        cliente.nome = entrada.nextLine();
        System.out.println("Qual é o seu CPF?");
        cliente.cpf = entrada.nextLong();

        while(flag) {
            System.out.println("Bem-vindo ao menu de informações");
            System.out.println("1 Mostrar a promoção 1");
            System.out.println("2 Mostrar a promoção 2");
            System.out.println("3 Mostrar a promoção 3");
            System.out.println("4 Comprar computador");
            System.out.println("0 Sair ou terminar compra");

            op=entrada.nextInt();
            switch (op) {
                case (1):
                   computador1.mostraPCConfigs();
                    break;

                case (2):
                    computador2.mostraPCConfigs();
                    break;

                case (3):
                    computador3.mostraPCConfigs();
                    break;
                case(4):
                    System.out.println("Qual é o computador que deseja comprar?");
                    op=entrada.nextInt();
                        switch (op) {
                            case (1):
                                for (int i = 0; i < cliente.computadores.length; i++) {
                                    if (cliente.computadores[i] == null) {
                                        cliente.computadores[i] = computador1;
                                        System.out.println("Computador adicionada");
                                        break;
                                    }
                                }
                                break;
                            case (2):
                                for (int i = 0; i < cliente.computadores.length; i++) {
                                    if (cliente.computadores[i] == null) {
                                        cliente.computadores[i] = computador2;
                                        System.out.println("Computador adicionada");
                                        break;
                                    }
                                }
                                break;
                            case (3):
                                for (int i = 0; i < cliente.computadores.length; i++) {
                                    if (cliente.computadores[i] == null) {
                                        cliente.computadores[i] = computador3;
                                        System.out.println("Computador adicionada");
                                        break;
                                    }
                                }
                        }
                        break;
                case (0):
                    flag = false;
                    if(cliente.computadores[0]!=null){
                        System.out.println("O nome do cliente é: "+ cliente.nome);
                        System.out.println("O CPF do cliente é: "+ cliente.cpf);
                        System.out.println("O total da compra do cliente é: "+ cliente.calculaTotalcompra());
                    }
                    break;
            }
        }

    }
}