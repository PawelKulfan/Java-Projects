package arraysExcersises;

public class Main01 {

    public static void main(String[] args) {
        int[] tab = new int[50];
        for (int i = 0; i < 50; i++) {
            tab[i] = i;
        }
        //System.out.println(Arrays.toString(tab));
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0){
                System.out.println();
            }
            if (tab[i]<10){
                System.out.print("0");
        }

            System.out.print(tab[i] + ", ");
            }
}


}
