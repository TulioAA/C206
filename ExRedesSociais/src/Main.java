import Classes.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<RedeSocial> redesSociais = new HashSet<>();

        Facebook facebook = new Facebook("999999",200);
        redesSociais.add(facebook);

        GooglePlus googlePlus = new GooglePlus("888888",1000);
        redesSociais.add(googlePlus);

        Twitter twitter = new Twitter("777777",0);
        redesSociais.add(twitter);

        Instagram instagram = new Instagram("666666",50);
        redesSociais.add(instagram);

        Usuario usuario1 = new Usuario(
                "Joãozinho Do Calipá",
                "omaiorcalipa@gmail.com",
                redesSociais
        );
        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getEmail());
        System.out.println();
        for(RedeSocial rede : usuario1.redesSociais){
            rede.executaAcoes();
            System.out.println();
        }
    }
}