package arraysExcersises;

//Method returns unique values from arr  with random values
import java.util.Arrays;

public class Main011Extended {

    public static void main(String[] args) {
        int[] arr = {1, 1, 7, 2, 3, 3, 7, 4, 4, 5, 6, 8, 8, 9};
        Arrays.sort(arr);//extended version is independent of order of the values, repeated values will bo sorted

        System.out.println(Arrays.toString(returnUnique(arr)));
    }
    public static int[] returnUnique(int[] arr) {
        int[] arrSelective = new int [arr.length];
        int comparedValue = arr[0];
        arrSelective[0] = arr[0];
        int valueIndex = 1;
        for (int i = 1; i < arr.length; i++){
            if (comparedValue != arr[i]){
                arrSelective[valueIndex] = arr[i];
                valueIndex++;
            }
            comparedValue = arr[i];
        }
        int[] arrSelectiveFinal = Arrays.copyOf(arrSelective, valueIndex);
        return arrSelectiveFinal;
    }

}
