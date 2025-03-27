import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner dist = new Scanner(System.in);
        int d = dist.nextInt();
        int t = dist.nextInt();
        int g = dist.nextInt();

        int vmedia = d/t;
        int consumo = d/g;

        System.out.println(vmedia);
        System.out.println(consumo);

    }

}