public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima() {
        float cilindrada = motor.getCilindrada();

        if (cilindrada <= 1.0f) {
            return 140;
        } else if (cilindrada > 1.0f && cilindrada <= 1.6f) {
            return 180;
        } else if (cilindrada > 1.6f && cilindrada <= 2.0f) {
            return 220;
        } else {
            return 260;
        }
    }

}
