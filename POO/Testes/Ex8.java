import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Scanner energia = new Scanner(System.in);
        float qk = energia.nextInt();
        float vk = energia.nextInt();
        float resultado;

        resultado = qk*vk; 

        if (qk < 150){
            System.out.println(resultado*0.9);
        }
        else{
            System.out.println(resultado);
        }

    }
}