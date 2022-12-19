package Aula04;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês desejado:");
        int mesNumero = scanner.nextInt();

        System.out.println(estamosEmQualMes(mesNumero));

        scanner.close();
    }

    public static String estamosEmQualMes(int mesNumeral) {
        String mesNome;

        switch (mesNumeral) {
            case 1 -> mesNome = "Janeiro";
            case 2 -> mesNome = "Fevereiro";
            case 3 -> mesNome = "Março";
            case 4 -> mesNome = "Abril";
            case 5 -> mesNome = "Maio";
            case 6 -> mesNome = "Junho";
            case 7 -> mesNome = "Julho";
            case 8 -> mesNome = "Agosto";
            case 9 -> mesNome = "Setembro";
            case 10 -> mesNome = "Outubro";
            case 11 -> mesNome = "Novembro";
            case 12 -> mesNome = "Dezembro";
            default -> mesNome = "Mês inválido!";
        }
        return mesNome;
    }
}
