package exceptionsExcersises;


public class Main06 {

    public static void main(String[] args) {
        try {
            System.out.println(divide1(5, 10));
        } catch (ArithmeticException e) {
            System.out.println("Debilu, dzielisz przez ziobro");
        }
        try {
            System.out.println(divide2(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Debilu, dzielisz przez ziobro");
        }
    }


    static int divide1 (int a, int b) throws ArithmeticException{
        int dividing1 = a / b;
        return dividing1;
    }
    static double divide2 (double c, double d){
        if (d <= 0) {
            throw new ArithmeticException();
        }
        else {
            double dividing2 = c / d;
            return dividing2;
        }
    }

}
