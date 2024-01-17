package methodsExcersises;
//Metoda, która przeliczy wiek psa w ludzkich latach.
//funkcja powinna przyjmować wiek psa jako losowy parametr,
//dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//funkcja powinna zwrócić wiek psa.

import java.util.Random;

public class Main011 {

    public static void main(String[] args) {
        Random r = new Random();
        int dogAge = r.nextInt(25);
        System.out.println(dogAge + " psich lat to " + dogAgeInHumanYears(dogAge) + " ludzkich lat");

    }

    public static double dogAgeInHumanYears(int dogAge) {
        double dogAgeInHumanYears = dogAge;
        if (dogAge <= 2) {
            dogAgeInHumanYears = dogAge * 10.5;
        } else {
            dogAgeInHumanYears = (2 * 10.5) + ((dogAge - 2) * 4);
        }
        return dogAgeInHumanYears;

    }
}
