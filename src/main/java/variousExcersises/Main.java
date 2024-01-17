public class Main {
    public static void main(String[] args) {
        int arrayA[] = {1, 6, 12, 534, 3, 321, 31, 1, 9, 632};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > max ) {
                max = arrayA[i];
            }
            else {

            }
        }
        System.out.print(max);
    }
}