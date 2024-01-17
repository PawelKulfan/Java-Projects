package variousExcersises;

public class Objects {/*
    //Tworzenie obiektu klasy, by z niego skorzystać
    NazwaKlasy nazwaObiektu = new NazwaKlasy();
    User user = new User(); // User - określenie typu obiektu (z wielkiej),
    user - nazwa zmiennej,
    new - nowy obiekt typu User (bez new utworzymy jedynie referencję)
    User() - konstruktor
    user.setLogin("login");//user - nazwa zmiennej obiektu, setLogin - metoda do wywoałania na obiekcie, w () argumenty
    user.age = 25; // user - nazwa zmiennej obiektu, .age - dodanie właściwości do obiektu, = 25 - wartości właściwości
    int userAge = user.age; // deklaracja zmiennej; po = przypisanie właściwości( wartości) do zmiennej int
    int i = 43;
    Integer intAsObject = Integer.valueOf(i);//obiekt reprezentujący zmienną i
    int i2 = intAsObject.intValue();
    int d1 = 3.13;
    Double dd = d1; //autoboxing - zamiana wartości na obiekt
    double dd2 = dd; //autounboxing - wyciągnięcie wartości z obiektu

WŁASNY KONTRUKTOR:
public Book(String name, double price, String author) {//nazwa konstruktora odpowida nazwie klasy, ale bez class
    this.name = name;
    this.price = price;
    this.author = author;//zamiast stałych zmiennych możemy podać tutaj odniesienie do metody ustawiającej kolor
}// jeśli napiszemy własny konstrukto, nie będzie można użyć defaultowego
Wywołanie konstruktora
Book book1 = new Book("Thinking in Java", 95.99, "Bruce Eckel");

OBIEKT KLASY WEWNĄTRZ KLASY I NIESTATYCZNE METODY:
private double cashValue = 0;//niestatyczna zmienna poza mainem
double getCashValue() { //getter niestatyczny
        return cashValue;
    }
void depositCash(int amount){//niestatyczna metoda poza mainem
        if (amount > 0) {
            cashValue = getCashValue() + amount;
        } else {
            System.out.println("Please deposit amount higher than 0");
        }
    }
String accountInfo1()  {//niestatyczna metoda poza main
        String accountInfo = "Account number: " + getAccountNumber() + " " + "Balance: " + getCashValue();
        return accountInfo;
    }
public static void main(String[] args) {//STATYCZNA METODA!
        BankAccount FirstAccount = new BankAccount();//obiekt klasy utworzony wenątrz tej klasy
        int amount = 4521;
        FirstAccount.depositCash(amount);//wywołanie na obiekcie klasy wenątrz tej klasy metody NIESTATYCZNEJ
        System.out.println(FirstAccount.accountInfo1());//Printowanie wartości NIESTATYCZNEJ metody na obiekcie klasy, wewnątrz klasy
*/}
