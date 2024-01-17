package methodsExcersises;
//Metoda, która zwraca wartość zmiennej multipler pomnożonej przez wartość argumentu index.
public class Main01 {

    public static void main(String[] args) {
        //wersja dłuższa
        /*int multipler = 3;
        int index = 5;
        int result = methodMultiplying(multipler, index);
        System.out.println(result);
        System.out.println(methodMultiplying(6, 9));
    }


        public static int methodMultiplying(int multipler, int index) {
            int multiplying = multipler * index;
            return multiplying;
        }*/
        //wersja zoptymalizowana
        System.out.println(methodMultiplie(4, 6));
    }
    static int methodMultiplie (int multipler, int index){
        return multipler * index;
    }
}

