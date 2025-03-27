import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int t = sec.nextInt();

        int horas = t/3600;
        int minutos = (t%3600) / 60; 
        int segundos = t % 60; 

        System.out.printf("%d %02d:%02d:%02d %n", t, horas, minutos, segundos);

        sec.close();  
    }

    
}