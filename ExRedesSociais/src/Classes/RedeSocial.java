package Classes;
import Excecoes.*;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws Ececao {
        if(senha.length() != 6){
            throw new Ececao("A senha deve ter 6 digitos");
        }
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void executaAcoes();
    public void curtirPublicacao(){
        System.out.println("Você curtiu a publicação");
    };
}
