package methodsExcersises;
//Publiczna metoda calculateNetto, która przyjmuje argumenty:
//gross: kwotę brutto ceny zakupu,
//vat: wartość podatku VAT w % (liczba zmiennoprzecinkowa z zakresu 0 – 23)
//Metoda zwraca wartość netto ceny
public class Main05 {

    public static void main(String[] args) {
        System.out.println(calculateNetto(123.45, 18.09));
        double netto = calculateNetto(123.45, 18.09);
        System.out.printf("%.2f", netto);
    }
    public static double calculateNetto(double gross, double vat){
        return gross / (1+(vat/100));
    }
}
