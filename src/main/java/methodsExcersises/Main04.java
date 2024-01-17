package methodsExcersises;
//Publiczna metoda createName, która przyjmuje następujące parametry:
//name: imię,
//surname: nazwisko,
//nickname: pseudonim.
//Metoda zwraca łańcuch tekstowy z połączonymi parametrami,
// w postaci: "imię pseudonim nazwisko".
public class Main04 {

    public static void main(String[] args) {
        String fullName = createName("Kulfan ", "Paweł ", "\"Pawlo\"");
        System.out.println(fullName);
    }
    public static String createName(String name, String nazwisko, String pseudonim){
        return String.join(name, nazwisko, pseudonim);
    }
}
