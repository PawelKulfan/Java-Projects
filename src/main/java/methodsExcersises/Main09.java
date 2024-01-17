package methodsExcersises;
//Publiczna metoda factorial, która przyjmuje jako parametr liczbę naturalną n.
//Metoda zwraca wartość n!,czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.
public class Main09 {

    public static void main(String[] args) {
        int n = 27;
        System.out.println(n + "! równa się " + factorial(n));

    }
    public static int factorial(int n){
        int currentResult = 1;
        for (int i = 1; i <= n; i++){
            int resultOfMultiplying = currentResult * (i);
            currentResult = resultOfMultiplying;
        }
        return currentResult;
    }
}
