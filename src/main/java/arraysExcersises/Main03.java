package arraysExcersises;

import java.util.Arrays;

//tworzenie 10-cio elementowej tablicy bez pętli for
public class Main03 {

    public static void main(String[] args) {
        int[] tab = new int [10];
        Arrays.fill(tab, 2);
        System.out.println(Arrays.toString(tab));
    }
}
