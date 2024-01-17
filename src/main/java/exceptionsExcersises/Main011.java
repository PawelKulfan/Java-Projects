package exceptionsExcersises;
//Metoda dokonuje konwersji zmiennych a i b na typ liczbowy int i wykonuje dzielenie zmiennej a przez zmienną b,
//zabezpiecz program przed możliwymi błędami,
//dodaj sekcję, która wykona się zawsze niezależnie od tego, czy wystąpi błąd, czy nie,
//pamiętaj o błędzie ArithmeticException,
//zmień typ zmiennych a i b na double i sprawdź jakie otrzymasz wyniki w przypadku dzielenia przez 0.

public class Main011 {

    public static void main(String[] args)  throws NumberFormatException, ArithmeticException {
        String a = "4";
        String b = "0";
        try {average(a, b);
        }  catch (NumberFormatException e1){
        System.out.println("Debilu, wpisz cyfry a nie litery");
        } catch (ArithmeticException e2){
        System.out.println("Debilu, próbujesz dzielić przez ziobro");
        } finally {
        System.out.println("To była dobra próba dzielenia");
        }
    }
    public static void average(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
            double result = aInt / bInt;
            System.out.println(result);
    }



}
