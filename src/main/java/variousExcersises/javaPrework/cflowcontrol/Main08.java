package pl.coderslab.cflowcontrol;

public class Main08 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";//variable storing asterisks in a row, it is zeroed at the beginning of each iteration

            //creating a loop that will generate asterisks in a row
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    row += " *";
                } else {
                    row += " " + j;
                }
                }
            System.out.print(row + "\n");
        }
    }
}