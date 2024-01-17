package arraysExcersises;

import java.util.Arrays;
import java.util.Random;

//tablica o nazwie numbers zawiera 10 losowych liczb, potem printujemy ją w odwrotnej kolejności
public class Main04 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println("Original Array: " + Arrays.toString(numbers));
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }//metoda powyżej dzieli tablicę na pół i przypisuje wartość w nowej tablicy ze starej tablicy
        System.out.println("Reversed Array: " + Arrays.toString(numbers));

        Random r2 = new Random();
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = r2.nextInt(10);
        }
        System.out.println("Original Array2: " + Arrays.toString(numbers2));
        int[] numbers3 = new int[10];
                    int i2 = numbers2.length - 1;
            while (i2 >= 0) {
                for (int i = 0; i < numbers3.length; i++){
                numbers3[i] = numbers2[i2];
                i2--;
            }
        }
        System.out.println("Reversed Array3: " + Arrays.toString(numbers3));
    }
}
