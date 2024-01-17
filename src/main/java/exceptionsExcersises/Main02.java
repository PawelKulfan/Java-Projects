package exceptionsExcersises;

public class Main02 {

    public static void main(String[] args) {
        try {
            int[] tab = {  5, 1, 6, 7, 8 } ;
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Number out off range of Array");
        }
    }

}
