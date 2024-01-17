package arraysExcersises;

import java.util.Arrays;
import java.util.Random;

//wypisuje w konsoli minimalną wartość z tablicy randNumbers, zawierającej 20 losowych liczb z zakresu 0-100
//
public class Main02 {

    public static void main(String[] args) {
        int[] tab = new int[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            tab[i] = r.nextInt(101);
        }
        System.out.println(Arrays.toString(tab));
        int maxNumber = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maxNumber) {
                maxNumber = tab[i];
            }
        }
        System.out.println(maxNumber);
    }
}
