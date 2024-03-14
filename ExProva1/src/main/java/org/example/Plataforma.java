package org.example;

public class Plataforma {
    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];
    void mostraInfo(){
        System.out.println("Mostrando informações ");
        System.out.println("Mostrando nome: "+ this.nome);
        System.out.println("Mostrando criador: "+ this.criador);
        for (int i = 0; i < jogos.length; i++)
        {
            if(jogos[i]!=null)
            {
                jogos[i].mostraInfo();
            }
        }

    }
    void adicionarJogo(Jogo jogo){
        for (int i = 0; i < jogos.length; i++)
        {
            if(jogos[i]==null)
            {
                jogos[i] = jogo;
                System.out.println("Jogo adicionado!");
                break;
            }
        }
    }
    void mostraMaisCaroBarato(){
        double maiorpreco=0;
        double menorpreco=9999999;
        int q=0;
        int w=0;

        for (int i = 0; i < jogos.length; i++)
        {
            if(jogos[i] != null ) {
                if (jogos[i].preco > maiorpreco) {
                    maiorpreco = jogos[i].preco;
                    q = i;
                }
                if (jogos[i].preco < menorpreco) {
                    menorpreco = jogos[i].preco;
                    w = i;
                }
            }
        }
        System.out.println("O mais caro é:"+jogos[q].nome);
        System.out.println("O mais darato é:"+jogos[w].nome);
    }
    void calculaDlc(){
        int t=0;
            for (int i = 0; i < jogos.length; i++) {
                if(jogos[i] != null)
                    if (jogos[i].dlc)
                        t++;
            }

        System.out.println("A quantidade de jogos que possui DLC são:"+t);
    }

}
