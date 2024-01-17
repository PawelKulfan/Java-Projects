package methodsExcersises;
//Publiczna metoda checkEvenOdd, która:
//przyjmuje parametr liczbowy number,
//zwraca wartość typu String,
//zwraca wynik "even", jeśli liczba jest parzysta,
//zwraca wynik "odd", jeśli liczba jest nieparzysta.
public class Main07 {

    public static void main(String[] args) {
        int number = 7;
        System.out.println(checkEvenOdd(number));
    }
    public static String checkEvenOdd(int number){
        if (number % 2 == 0){
            return "even";
        }
        else {
            return "odd";
        }

    }
}
