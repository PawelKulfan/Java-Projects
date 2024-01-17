package methodsExcersises;
//Publiczna metoda checkMaturity, która:
//przyjmuje parametr liczbowy age oznaczający wiek użytkownika,
//sprawdza, czy użytkownik jest pełnoletni,
//zwraca wartość true – jeśli jest pełnoletni,
//zwraca wartość false – jeśli nie jest.
public class Main06 {

    public static void main(String[] args) {
        int age = 17;
        System.out.println(checkMaturity(age));
    }
    public static boolean checkMaturity(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }

    }
}
