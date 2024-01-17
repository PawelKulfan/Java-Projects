public class proba3 {
    public static void main(String[] args) {//również metoda
        int ret1 = sum(40, 2);
        int ret2 = sum(23, 312);
        System.out.println(ret1);
        System.out.println(ret2);
    }
    static int sum(int a, int b){//metoda wewnątrz klasy
        int result = a + b;
        return result;
    }
}
