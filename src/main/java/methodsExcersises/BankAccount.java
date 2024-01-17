package methodsExcersises;

import java.util.Random;

//Stwórz klasę BankAccount, która ma spełniać następujące wymogi:
//    Mieć prywatne atrybuty:
//    number - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć, że numerem konta może być dowolna liczba całkowita),
//    cash - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa. Atrybut cash powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
//    Posiadać gettery do atrybutów number i cash, ale NIE posiadać do nich setterów (nie chcemy, żeby raz stworzone konto mogło zmienić swój numer,
//    a do atrybutu cash dodamy specjalne funkcje modyfikujące jego wartość).
//    Posiadać metodę void depositCash(amount) której rolą będzie zwiększenie wartości atrybutu cash o podaną wartość. Pamiętaj o sprawdzeniu, czy podana wartość jest:
//    Większa od 0
//    Posiadać metodę double withdrawCash(amount) której rolą będzie zmniejszenie wartości atrybutu cash o podaną wartość. Metoda ta powinna zwracać ilość wypłaconych pieniędzy.
//    Dla uproszczenia zakładamy, że ilość pieniędzy na koncie nie może zejść poniżej 0, np. jeżeli z konta, na którym jest 300 zł, próbujemy wypłacić 500 zł, to metoda zwróci nam tylko 300 zł.
//    Pamiętaj o sprawdzeniu, czy podana wartość jest:
//    Większa od 0
//    Posiadać metodę String toString() nieprzyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie.
public class BankAccount {
    Random r = new Random();
    private int accountNumber = r.nextInt(1000);
    private double cashValue = 0;

     double getCashValue() {
        return cashValue;
    }
    int getAccountNumber() {
        return accountNumber;
    }
     void depositCash(int amount){
        if (amount > 0) {
            cashValue = getCashValue() + amount;
        } else {
            System.out.println("Please deposit amount higher than 0");
        }
    }

    double withdrawCash(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if ((getCashValue() - withdrawAmount) < 0) {
                withdrawAmount = withdrawAmount + (getCashValue() - withdrawAmount);
                cashValue = getCashValue() - withdrawAmount;
            } else {
                cashValue = getCashValue() - withdrawAmount;
            }
        } else {
            System.out.println("Please withdraw amount higher than 0");
        }
        return withdrawAmount;
    }
    String accountInfo1()  {
        String accountInfo = "Account number: " + getAccountNumber() + " " + "Balance: " + getCashValue();
        return accountInfo;
    }
    public static void main(String[] args) {
        BankAccount FirstAccount = new BankAccount();
        int amount = 4521;
        FirstAccount.depositCash(amount);
        System.out.println("Deposit value: " + amount);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.depositCash(0);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.depositCash(542);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.withdrawCash(892.12);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.withdrawCash(4200);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.withdrawCash(0);
        System.out.println(FirstAccount.accountInfo1());
        FirstAccount.withdrawCash(892.12);
        System.out.println(FirstAccount.accountInfo1());
        BankAccount SecondAccount = new BankAccount();
        System.out.println(SecondAccount.accountInfo1());
        SecondAccount.depositCash(4521);
        SecondAccount.depositCash(542);
        System.out.println(SecondAccount.accountInfo1());
    }
}