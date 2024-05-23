package Classes;
import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    public HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
