package arraysExcersises;
//Dla otrzymanej tablicy jej zawartość zostaje skopiowana
// do tymczasowej tablicy, której rozmiar jest 2-krotnie większy od tablicy podanej.
//Uzupełnia brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej
// w odwrotnej kolejności.
//Metoda zwraca skopiowaną i uzupełnioną tablicę.

import java.util.Arrays;

public class Main022 {

    public static void main(String[] args) {
        int[] arrOriginal = {1, 5, 6, 8, 7};
        System.out.println(Arrays.toString(arrOriginal));
        System.out.println(Arrays.toString(append(arrOriginal)));

    }
    public static int[] append(int[] arrOriginal){
        int[] arrFinal = Arrays.copyOf(arrOriginal, arrOriginal.length * 2);
        int iArrOriginal = arrOriginal.length - 1;
        int iArrFinal = 0;
        for (int value : arrFinal){
            if (arrFinal[iArrFinal] == 0){
                arrFinal[iArrFinal] = arrOriginal[iArrOriginal];
                iArrOriginal -= 1;
            }
            iArrFinal++;
        }
        return arrFinal;
    }

}
