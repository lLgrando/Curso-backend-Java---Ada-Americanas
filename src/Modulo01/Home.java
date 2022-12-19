import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        // printa numeros pares
        for(int i = 0; i <= 10; i++) {
            if((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}
