package arraysExcersises;
//metoda sprawdza, czy w 20 elementowej teblicy o zakresie 0-20 arr istnieje element z zakresu 0-20,
//jeżeli tak ma zwracać true,
//jeżeli nie ma zwracać false.

import java.util.Arrays;
import java.util.Random;

public class Main033 {


    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        Random r2 = new Random();
        int element = r2.nextInt(20);
        System.out.println(Arrays.toString(arr));
        System.out.println(element);
        System.out.println(contains(arr, element));
    }

    public static boolean contains(int[] arr, int element) {
        boolean returnedValue = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                returnedValue = true;
                break;
            } else {
                returnedValue = false;
            }
        }
        return returnedValue;
    }
}
