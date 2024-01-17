public class proba5 {
    public static void main(String[] args) {
        String result = isEvenOrOdd(42);
        System.out.println(result);
    }

    private static String isEvenOrOdd(int number) {
        if(number % 2 == 0){
            return "even";
        }
        return "odd";
    }

    //public static String PrintIsEvenOrOdd(int number) {
      //  if (number % 2 == 0){


    }
}
