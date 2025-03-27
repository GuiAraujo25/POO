package formas;

public class Circulo {

    private int x,y;
    private float raio;

    public Circulo(int x, int y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public Circulo(Circulo outro) {
        this.x = outro.x;
        this.y = outro.y;
        this.raio = outro.raio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
