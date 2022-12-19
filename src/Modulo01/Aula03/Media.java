package Aula03;

import java.util.Arrays;
import java.util.Random;

public class Media {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }

        System.out.printf(" \nA média do array é: %.2f \n", Arrays.stream(array).average().getAsDouble());
    }
}
