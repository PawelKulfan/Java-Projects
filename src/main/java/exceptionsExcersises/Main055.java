package exceptionsExcersises;
//metoda zwraca index elementu value zawartego w tablicy elements,
//jeśli tablica nie posiada podanego elementu zwraca wyjątek NoSuchElementException,


import java.util.NoSuchElementException;
import java.util.Random;

public class Main055 {

    public static void main(String[] args) {
        int[] elements = {3, 4, 1, 5, 7};
        Random r = new Random();
        int value = r.nextInt(10);
        try {
            System.out.println("Index of value " + value + " is: " + indexOf(elements, value));
        } catch (NoSuchElementException e) {
            System.out.println("Value is not in the array");
        }

    }

    public static int indexOf(int[] elements, int value) {
        /*int index = Arrays.asList(elements).indexOf(value);
        return index;*/
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                index = i;
            }
        }
        if (index == -1) {
            throw new NoSuchElementException();
        } else {
            return index;
        }

    }
}