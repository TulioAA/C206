package Classes;

public class Instagram extends RedeSocial {
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto() {
    System.out.println("Postou foto no instagram");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou video no instagram");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no instagram");
    }
    @Override
    public void curtirPublicacao() {
        System.out.println("Curtir publicacao no instagram");
    }
    @Override
    public void executaAcoes() {
        System.out.println("Executou nenhuma Acão no Instagram");
    }
}
