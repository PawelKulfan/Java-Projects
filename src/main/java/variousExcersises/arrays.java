package variousExcersises;

public class arrays {/*
    int[] myNumbers = new int[5]; //W tym momencie mamy pięcioelementową tablicę, której elementy są zerami.
    numbers.length // zwraca rozmiar tablicy

for (String variableName : tableName) { //foreach
        System.out.println(variableName); // przejść Po elementach tablicy,schematyczny zapis
        String[] titles = new String[2];
        for (String title : titles) {
            System.out.println(title);//przykłąd do powyższego


KOPIOWANIE TABLIC:
            int[] tab = {1, 2, 3, 4};
            int[] copyTab = tab;//W ten sposób zamiast skopiować tablicę tworzymy dodatkową referencję.

            int[] tab1 = { 9, 21, 32, 42, 11 };
            int[] copyTab1 = new int[7];
            for (int i = 0; i < tab1.length; i++) {
                copyTab1[i] = tab1[i];
            }
            copyTab1[5] = 33;
            copyTab1[6] = 44;//skopiowanie tablicy: stworzenie tablicy o takim samym typie, skopiowanie elementów jednej do drugiej, a następnie ewentualne uzupełnienie dodatkowych wartości.

FUNKCJA CLONE
            int[] cloneArray = tab.clone();//Kolejnym sposobem na skopiowanie tablicy jest wykorzystanie metody clone():

            int[] copyArray = Arrays.copyOf(tab, dataSize);//Możemy również skorzystać z metod klasy java.util.Arrays:
            //tab – tablica, z której będziemy kopiować dane, dataSize – długość tablicy copyArray.
            //Jeżeli drugi parametr będzie większy od rozmiaru kopiowanej tablicy dane zostaną automatycznie uzupełnione domyślną wartością dla danego typu.
            //Jeżeli będzie mniejszy – tylko część danych zostanie skopiowana.
            //W przypadku gdy kopiujemy dane do istniejącej już tablicy o określonym rozmiarze, rozmiar ten zostanie zmieniony (zmniejszony lub zwiększony).
            int[] array1 = { 1, 2, 3 };
            int[] array2 = new int[10];
            array2 = Arrays.copyOf(array1, array1.length);
            System.out.println(array2.length);
            //zwróci: 3

Klasa java.util.Arrays udostępnia kilka użytecznych metod:
            Arrays.toString(tab) – zwraca elementy tablicy przekształcone na typ String,
            Arrays.copyOf(tab, dataSize) – kopiowanie,
            Arrays.fill(tab, element) – wypełnianie tablicy podanym elementem,
            Arrays.equals(tab1, tab2) – porównanie tablic,
            Arrays.sort(tab) – sortowanie tablicy.

            public static void main(String[] args) { //FUNKCJA SUMUJE WARTOŚCI ZE STRINGÓW
                double sum = calculateSum(new String[]{"0", "1", "1", "2", "3", "5", "8"});//CIEKAWY SPOSÓB URUCHOMIENIA METODY ORAZ DEKLARACJI ZMIENNYCH
                System.out.println("Sum " + sum);
    }

            private static double calculateSum(String[] input) {
                double result = 0;//STARTOWY WYNIK
                for (int i = 1; i < input.length; i++) {
                result += Integer.parseInt(input[i]);//WYCIĄGA WARTOŚCI Z DEKLARACJI ZALEŻNIE OD i, ZAMIENIA JE NA INT (parseInt) I ZAPISUJE JAKO RESULT, += SUMUJE DOTYCHCZASOWE WYNIKI
        }
                return result;
    }
REFERENCJE
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
        int [] arr1 = {1, 2};//tablica z dwiema komórkami pamięci, tablica jest obiektem
        int[] arr2 = arr1; // tablica arr2 referencjuje te same komórki w pamięci

int [] ints = {42, 4221};
        System.out.println(ints);//wyświetli nam referencję (adres) do wskazanej tablicy (obiektu)
        System.out.println(Arrays.toString(ints));//to skompiluje tablicę do stringa i wyswuietli wartości
        Arrays.equals()//porównuje tablice
        Arrays.sort();//sortuje tablice defaultowo rosnąco


            */
        }
