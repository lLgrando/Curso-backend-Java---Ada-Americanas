package Aula02;
import java.util.Scanner;

public class Numero {
    static double primeiroNumero;
    static double segundoNumero;
    static double terceiroNumero;

    public static void addNumero(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o 1° numero:");
            primeiroNumero = scanner.nextDouble();

            System.out.println("Digite o 2° numero:");
            segundoNumero = scanner.nextDouble();

            System.out.println("Digite 3° numero:");
            terceiroNumero = scanner.nextDouble();

            maiorNumero();
        } 
        catch (Exception e) {
            System.out.println("Entrada inválida.");
            System.out.println(e);
        }   

        scanner.close();
}

    public static void maiorNumero() {
        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println(primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println(segundoNumero);
        } else {
            System.out.println(terceiroNumero);
        }
    }
}
