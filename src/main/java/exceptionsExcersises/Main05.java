package exceptionsExcersises;


public class Main05 {

    public static void main(String[] args) {
    try {
        int num = Integer.parseInt("554") ;
        System.out.println(num);}
    catch (NumberFormatException e){
        System.out.println("Type numerical value to parse it to int");
        }
    finally {
        System.out.println("Ale hu*, i tak coś napiszemy");
    }

    }

}
