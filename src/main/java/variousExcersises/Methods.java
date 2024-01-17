package variousExcersises;

public class Methods {
    public static void main(String[] args) {/*
SYGNATURY METOD:
    public static void main(String[] args) {//Część logiczna, wysokiego poziomu
        // statyczne widzi tylko statyczne
        System.out.println("ala ma kota");
        System.out.println(42);
        System.out.println(3.14159);

        sayHello();//wywołanie metody
        sayHello("Ala");//wie którą sayHello ma wykonać, bo sygnatura mu to mówi
        // (musi być nazwa + odpowiednia sygnatura (w tym przypadku string)
        sayHello("Roman");
        sayHello("Anna", 3);//tu tylko ta ostatnia sygnatura będzie pasować, bo jest i string i int
    }
    //część "funkcyjna", gdzie dzieją się rzeczy, w w tej wyższej je tylko wywołujemy
    static void sayHello() {// method overloading
        System.out.println("hello people!");
    }

    static void sayHello(String name) { // sygnatura hayHello_String
        System.out.println("hello, " + name);
    }

    static void sayHello(String name, int n) {//sygnatura sayHello_String_Int
        for (int i=0; i<n;i++) {
            System.out.println("hello, " + name);
        }
    }

METODY
    int methodName ();//metoda bez parametrów, zwracana wartość jako int
    int methodName(int param1; int param2; int param3); //definiowanie metody(nazwa methodName) z sugnaturą (to co w nawiasie)

    void // metoda, która nie zwraca wartości, a ważny jest efekt uboczny metody (np print), bez return
    public static void main(String[] args) {//metoda main, która musi być (Start Point)
        String name = "User";//utowrzenie zmiennej String o nazwie name, która podstawi imię do zmiennej userName
         sayHello(name); //wywołanie metody która jest poniżej (egzekucja jej kodu) z użyciem zmiennej name (zmienna name jest wartości zmiennej userName)
    }
    static void sayHello(String userName) {//definicja metody o nazwie sayHello(nazwa sugeruje co ona robi), która przyjumje wartość zmiennej typu String o nazwie userName
        System.out.println("Hello " + userName);//kod metody, który printuje Hello + zmienną userName



"METODY, KTÓRE ZWRACAJĄ WARTOŚĆ";
    int calculateSum(int a, int b) {//Definijujemy metodę, która zwraca wartość jako int(początek) o nazwie calculateSum z sygnaturą zmiennych typu int o nazwie a i b
        int sum = a + b;//kod metody, który tworzy zmienną sum typu int, której wartość to a + b
        return sum;//zwraca wartość sumy jako int
        //lub
        return a + b;


    //wywołanie metody np. w metodzie main
    int a = 3;//deklarujemy zmienną a o wartości 3
    int b = 2;//deklarujemy zmienną b o wartości 2
    int resultSum = calculateSum(a, b);//wynik działania metody calculateSum z wartościami a i b przypisujemy do zmiennej resultSum, dzięki czemy całej metody możemy użyć wywołując jedynie zmienną resultSum


"PRZYKŁADY DEFINIOWANIA METOD"
    void method1() {
        System.out.println("Nic nie zwraca.");
    }
    int method2() {
        return 321;
    }
    String method3() {
        return "Coderslab";
    }


"METODY STATYCZNE typu Static"
    //możemy je definiować bez tworzenia z nich obiektu, np.:
    public static String joined = String.join("-", "Coders", "Lab");  //wynik: Coders-Lab
    //Statyczną metodę możemy wywołać (czyli uruchomić) w dowolnym miejscu metody main naszego programu lub każdej innej metody statycznej.


IMPORTOWANIE METOD
import static java.lang.Math.PI;
import static java.lang.String.join;//importowanie statyczne metody
public class proba6 {
    public static void main(String[] args) {
        String s = String.join("ala ", "ala ma kota");//dodane .var na końcu
        double myPi = PI;//alt eneter i automatyczny import przed klasą
    }
*/
    }
}
