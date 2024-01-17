package arraysExcersises;
//Sortowanie tablicy rosnąco
import java.util.Arrays;
import java.util.Random;

public class Main05 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println("Original Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));


    }
}
