package methodsExcersises;
//metody zwraca true bądź false w zależności czy zmienna a jest podzielna przez b.

import java.util.Random;

public class Main022 {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(25);
        int b = r.nextInt(25);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (divisibleBy(a, b) == true){
            System.out.println("a jest podzielne przez b");
        } else {
            System.out.println("a nie jest podzelne przez b");
        }

    }
    public static boolean divisibleBy(int a, int b ){
        boolean resultOfModulo = true;
        if (a % b == 0){
            resultOfModulo = true;
        } else {
            resultOfModulo = false;
        }
        return resultOfModulo;
    }

}
