package methodsExcersises;
//Publiczna metoda maxOfThree, która przyjmuje trzy parametry liczbowe.
// Metoda zwraca największą liczbę.
public class Main08 {

    public static void main(String[] args) {
        int maxNumber = maxOfThree(53, 34, 79);
        System.out.println(maxNumber);
    }
    public static int maxOfThree(int no1, int no2, int no3){
        int maxNumber = no1;
            if (no2 > no1){
                maxNumber = no2;
                if (no3 > no2){
                    maxNumber = no3;
                }
            }   else if (no3 > no1){
                maxNumber = no3;
                }
            return maxNumber;
    }
}
