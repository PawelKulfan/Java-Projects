package advencedCalculator;

//Stwórz klasę AdvancedCalculator, która dziedziczy po klasie Calculator. Klasa powinna implementować następujące metody:
//    pow(num1, num2) – metoda ma zwracać num1 do potęgi num2. Dodatkowo w tablicy operacji ma zapamiętać napis: "num1^num2 equals result".
//    root(num1, num2) – metoda ma wyliczyć pierwiastek num2 stopnia z num1. Dodatkowo w tablicy operacji ma zapamiętać napis: "num2 root of num1 equals result".
public class AdvencedCalculator extends Calculator {

    public AdvencedCalculator (String id){
        super(id);
    }
    int power (int num1, int num2) {
        int result = (int) Math.pow(num1, num2);
        String entry = String.format("%1$d to %2$d power, got result %3$d", num1, num2, result);
        this.addOperationsHistory(entry);
        return result;
    }
    int root (int num1, int num2) {
        int result = (int) Math.pow(num1, 1/num2);
        String entry = String.format("%1$d ^ %2$d results %3$d", num1, num2, result);
        this.addOperationsHistory(entry);
        return result;
    }
}
