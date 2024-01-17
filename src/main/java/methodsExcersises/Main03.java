package methodsExcersises;
//Metoda convertToUsd, która przyjmuje parametr pln, czyli kwotę w złotówkach.
// Metoda zwraca podaną kwotę w dolarach amerykańskich.
//Wartość 1 USD = 4.04 PLN
public class Main03 {

    static public void main(String[] args) {
        double amountPln = 456.67;
        double amountUsd = convertToUsd(amountPln);//zamknięcie wyniku metody do zmiennej
        System.out.println("Wartość pln w usd to: " + convertToUsd(amountPln));
        System.out.printf("Wartość pln w usd to: " + "%.2f", amountUsd);//ograniczenie do 2 cyfr po przecinku
    }
    static double convertToUsd(double pln){
        double conversionRate = 4.04;
        double convertResult = pln / conversionRate;
        return convertResult;
    }
}
