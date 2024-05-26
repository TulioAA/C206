import Classes.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<RedeSocial> redesSociais = new HashSet<>();
        String emailt = "omaiorcalipa@gmail.com.br";

        try {
            Facebook facebook = new Facebook("999999", 200);
            redesSociais.add(facebook);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            GooglePlus googlePlus = new GooglePlus("888888", 1000);
            redesSociais.add(googlePlus);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Twitter twitter = new Twitter("77777", 0);
            redesSociais.add(twitter);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Instagram instagram = new Instagram("666666", 20);
            redesSociais.add(instagram);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Usuario usuario1 = new Usuario("Joãozinho Do Calipá", "omaiorcalipa@gmail.com", redesSociais);
        System.out.println("Nome: " + usuario1.getNome());

        try {
            usuario1.acessarEmail(emailt);
            System.out.println("Email: " + usuario1.getEmail());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        
        for(RedeSocial rede : usuario1.redesSociais){
            rede.executaAcoes();
            System.out.println();
        }
    }
}