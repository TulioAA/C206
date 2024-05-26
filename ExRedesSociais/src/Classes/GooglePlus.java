package Classes;

public class GooglePlus extends RedeSocial implements Compartilhamento,VideoConferencia{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    public void compartilhar() {
        System.out.println("Compartilhou no google plus");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no google plus");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou video no google plus");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no google plus");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicacao no google plus");
    }
    public void fazStreaming() {
        System.out.println("Fez streaming no google plus");
    }
    @Override
    public void executaAcoes() {
        postarComentario();
        fazStreaming();
        curtirPublicacao();
    }
}
