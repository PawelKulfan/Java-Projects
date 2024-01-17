package exceptionsExcersises;
//Metody zwraca napis str zamieniony na typ int,
//obsłuż możliwe wyjątki.

public class Main044 {

    public static void main(String[] args) {
        String str = "xyz";
        try {
            System.out.println(toInt(str));
        } catch (IllegalArgumentException e){
            System.out.println(str + " to nie są cyfry");
        }

    }
    public static int toInt(String str) throws IllegalArgumentException {
        int result = Integer.parseInt(str);
        return result;
    }

}
