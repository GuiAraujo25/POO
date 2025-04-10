public class Main {
    public static void main(String[] args){
        Carro c = new Carro("Corsa", new Motor(1.0f));

        System.out.println(c.velocidadeMaxima());


    }
}