
public class Sequencia {

    private int inicio;
    private int fim;
    private int p;

    public Sequencia(int inicio, int fim) {
        if (inicio > fim) {
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    public void ImprimirSequencia(int p){
        for (int i = inicio; i <= fim; i = i + p){

        }
    }

}
