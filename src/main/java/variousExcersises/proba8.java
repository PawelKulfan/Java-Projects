import java.util.Arrays;

public class proba8 {
    public static void main(String[] args) {
        int name0 = 1;
        int name1 = 2;
        int name2 = 3;
        int[] names = new int[5];
        names[0] = name0;
        names[1] = name1;
        names[2] = name2;//w tablicy są referencje do zmiennych w tym przypadku
        int[] ages = {22, 23, 24};//w tej tablicy są stałe weartości
        System.out.println(names[2]);
        System.out.println(names.length);//wyświetli ilość wartości w tablicy
        int[] copyArrays = Arrays.copyOf(tab, dataSize); //kopiowanie tablicy(tab) z ustawieniem nowego rozmiaru (dataSize),
        //kopiują się referencje lub typy rpymitywne, w zależności co jest w tablicy źródłowej, jeśli w tablicy źródłowej
        //była referencja, to w nowej tablicy wartości też będą referencją do tej wartości
        //
int [] ints = {42, 4221};
        System.out.println(ints);//wyświetli nam referencję (adres) do wskazanej tablicy (obiektu)
        System.out.println(Arrays.toString(ints));//to skompiluje tablicę do stringa i wyswuietli wartości
        Arrays.equals()//porównuje tablice
        Arrays.sort();//sortuje tablice defaultowo rosnąco

    }
}
