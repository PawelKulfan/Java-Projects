package exceptionsExcersises;
//metody zwraca element tablicy strTab zawarty pod indeksem index,

import java.util.Random;

public class Main022 {

    public static void main(String[] args) throws IndexOutOfBoundsException, NullPointerException {
        String[] strTab = {"Ala", null, "Gienia"};
        //String[] strTab = new String[3];
        //Integer[] strTab = {0, 1, 2};
        Random r = new Random();
        int index = r.nextInt(3);
        try {
            System.out.println(safeGet(strTab, index));
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Wpisz prawidłowy numer indexu");
        } catch (NullPointerException e2) {//won't work because printing null string will not be an error, it is possible to print it
            System.out.println("Wpisz prawidłowe imię do tablicy");
        } finally {
            System.out.println(index);
        }

    }
    public static String safeGet(String[] strTab, int index) throws NullPointerException {
        String result = "";
        try {
            result = strTab[index];
        } catch (NullPointerException e2) {
            System.out.println("Wpisz prawidłowe imię do tablicy");
        }
        return result;
    }

}
