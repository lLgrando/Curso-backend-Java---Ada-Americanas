package Aula05;

public class Matriz {
    public static void main(String[] args) throws InterruptedException {

        int[][] numeros = new int[10][10];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
