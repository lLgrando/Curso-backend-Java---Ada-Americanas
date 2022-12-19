package Aula07;

import java.util.Scanner;

public class DiasAnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();

            if (minutos == 0) {
                System.out.println("Encerrado.");
                break;
            }

            int anos = minutos / 525600;
            int dias = (int) (((minutos / 525600f) - anos) * 365);

            System.out.println("Anos: " + anos + " | Dias: " + dias);

        }
        scanner.close();
    }
}
