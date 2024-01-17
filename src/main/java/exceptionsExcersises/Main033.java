package exceptionsExcersises;


public class Main033 {

    public static void main(String[] args) throws NullPointerException {
        String str = null;
        try {
            System.out.println(getLength(str));
        } catch (NullPointerException e) {
            System.out.println("Wpisz przynajmniej jeden znak");
        }

    }
    public static int getLength(String str) throws NullPointerException{

        return str.length();
    }
}
