package Classes;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    public void compartilhar() {
        System.out.println("Compartilhou no Twiter");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twiter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou video no Twiter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Twiter");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtir publicacao no Twiter");
    }
    @Override
    public void executaAcoes() {
        System.out.println("Executou nenhuma Acão no Twiter");
    }
}
