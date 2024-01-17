package advencedCalculator;

import java.util.Arrays;

//Stwórz klasę Calculator. Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String,
// w której będzie trzymać historię ostatnich operacji (stwórz ją w konstruktorze – z początkowym rozmiarem 0). Następnie dodaj do klasy następujące metody:
//    add(num1, num2) – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added num1 to num2 got result".
//    multiply(num1, num2) – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied num1 with num2 got result".
//    subtract(num1, num2) – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted num1 from num2 got result".
//    divide(num1, num2) – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided num1 by num2 got result".
//    Pamiętaj, że nie można dzielić przez zero.
//    printOperations() – metoda ma wypisać wszystkie zapamiętane operacje.
//    clearOperations() – metoda ma wyczyścić wszystkie zapamiętane operacje.
//
//Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
//
//Pamiętaj o używaniu this w odpowiednich miejscach. Stwórz kilka kalkulatorów i przetestuj ich działanie.
public class Calculator {
    String[] operationsHistory;
    String id;
    public Calculator (String id){
        this.operationsHistory = new String[0];
        this.id = id;
    }
    int add (int num1, int num2) {
        int result = num1 + num2;
        String entry = String.format("Added %1$d to %2$d, got result %3$d", num1, num2, result);
        this.addOperationsHistory(entry);
        return result;
    }
    int subtraction (int num1, int num2) {
        int result = num1 - num2;
        String entry = String.format("Substracted %1$d from %2$d, got result %3$d", num2, num1, result);
        this.addOperationsHistory(entry);
        return result;
    }
    int multiply (int num1, int num2) {
        int result = num1 * num2;
        String entry = String.format("Multiplied %1$d with %2$d, got result %3$d", num1, num2, result);
        this.addOperationsHistory(entry);
        return result;
    }
    int divide (int num1, int num2) {
        int result = 0;
        if (num2 > 0) {
            result = num1 / num2;
            String entry = String.format("Divided %1$d with %2$d, got result %3$d", num1, num2, result);
            this.addOperationsHistory(entry);
        } else {
            String forbiddenOperation = String.format("Tried to divide %1$d with ziobro.", num1);
            System.out.println("Can't divide by ziobro: " + forbiddenOperation);
        }
        return result;
    }
    String[] addOperationsHistory (String entry){
        String[] tempOperationsHistory = Arrays.copyOf(this.operationsHistory, this.operationsHistory.length + 1);
        tempOperationsHistory[tempOperationsHistory.length-1] = entry;
        return this.operationsHistory = tempOperationsHistory;
    }
    void printOperations() {
        //System.out.println(Arrays.toString(this.operationsHistory));//valid, but prints in form of Array
        String currentOperations = String.format("-------Current Operations List of %1$s-------",this.id);
        System.out.println(currentOperations);
        for (String entry : this.operationsHistory){//Prints entries of the Array in a list
            System.out.println(entry);
        }
    }
    void clearOperations(){
        this.operationsHistory = new String[0];
    }
}
