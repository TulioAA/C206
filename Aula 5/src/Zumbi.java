public class Zumbi {
    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40f;
        forca = 500;
    }
    void andar(){
        System.out.println("Zumbi andando...");
    }
    void alimentar(){
        System.out.println("Zumbi se alimentando");
    }
}
