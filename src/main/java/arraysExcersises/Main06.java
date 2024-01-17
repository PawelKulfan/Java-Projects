package arraysExcersises;

import java.util.Arrays;
import java.util.Random;

public class Main06 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println("First Array:  " + Arrays.toString(numbers));
        Random r2 = new Random();
        int[] secondNumbers = new int[10];
        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = r2.nextInt(10);
        }
        System.out.println("Second Array: " + Arrays.toString(secondNumbers));
        int[] finalNumbers = new int[10];
        for (int i = 0; i <numbers.length; i++){
            finalNumbers[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println("Final Array:  " + Arrays.toString(finalNumbers));
    }
}
