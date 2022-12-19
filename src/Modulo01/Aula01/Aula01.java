package Aula01;
import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Variaveis();
        Converter();
    }

    public static void Variaveis () {
        String nome = "Leonardo";
        int idade = 27;
        boolean usuarioAtivo = true;
        double saldo = 10.55;
    
        if (usuarioAtivo) {
            System.out.println(nome + " - " + idade + " anos - " + usuarioAtivo + " - " + saldo);
        } else {
            System.out.println("Usuario inativo.");
        }
    }

    public static void Converter () {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Digite a temperatura em °C");
        
        try {
          float temperaturaCelsius = scanner.nextFloat();  
          System.out.println(temperaturaCelsius * 1.8 + 32 + " °F");
        } 
        catch (Exception e){
          System.out.println("#### Erro de tipo ####");
        }

        scanner.close();
    }
}