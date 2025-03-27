import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        int resultado;

        resultado = n%2;

        if (resultado == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }

    }
}