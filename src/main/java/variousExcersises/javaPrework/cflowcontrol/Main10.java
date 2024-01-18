package pl.coderslab.cflowcontrol;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    row += " *";
                } else {
                    row += " " + j;
                }
            }
            System.out.print(row + "\n");
        }
        for (int i = 5; i >= 0; i--) {
            String row = "";
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
