package exceptionsExcersises;


public class Main01 {
        public static void main(String[] args1) {
        //obsługa wyjątków poza metodą
        try {
            int factorialResult =  factorial1(-30);
            System.out.println(factorialResult);
        }
        catch (IllegalArgumentException e){
             System.out.println("Podaj liczbę większą od 0!");
        }
        System.out.println("");
        //obsługa wyjątków wewnątrz metody
        factorial2(-359);
    }
    //obsługa wyjątków poza metodą
    static int factorial1(int number1) {
        if (number1 <= 0) {
            throw new IllegalArgumentException();
        } else {
            int result = 1;
            for (int i = 1; i <= number1; i++) {
                result *= i;
            }
            return result;
        }
    }

    //obsługa wyjątków wewnątrz metody
    static int factorial2(int number2) {
        int result = 1;
        try {
            if (number2 <= 0) {
                throw new IllegalArgumentException();}
            else {
                for (int i = 1; i <= number2; i++) {
                    result *= i;
                }
                System.out.println(result);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Podaj liczbę większą od 0!");
        }
        return result;
    }
}
