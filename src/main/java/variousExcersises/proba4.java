public class proba4 {
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
}