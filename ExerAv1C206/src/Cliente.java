public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];

    float calculaTotalcompra(){
        float soma=0;
        for (int i = 0; i < this.computadores.length; i++) {
            if(this.computadores[i]!=null)
                soma = soma + this.computadores[i].preco;
        }
        return soma;
    }

}
