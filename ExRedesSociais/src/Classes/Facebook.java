package Classes;

public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    public void compartilhar() {
        System.out.println("Compartilhou no facebook");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no facebook");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou video no facebook");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no facebook");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("curtiu publicacao no facebook");
    }
    public void fazStreaming() {
        System.out.println("fez streaming no facebook");
    }
    @Override
    public void executaAcoes() {
        compartilhar();
        postarFoto();
        postarVideo();
    }
}
