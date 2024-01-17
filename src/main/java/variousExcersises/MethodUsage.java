package variousExcersises;

public class MethodUsage {
    /*ta klasa wykorzystuje (np. testuje) inną klasę Pen
    public class Pentest {
    public static void main(String[] args) {
        Pen bluePen = new Pen(); //tworzenie instancji obiektu przy użyciu konstrukotra (inicjalizacja komórek pamięci)
        bluePen.color = "blue";//parametr obiektu z klasy Pen
        bluePen.lengthInMm = 200;//parametr obiektu z klasy Pen
        Pen greenPen = new Pen();//instancja z modelu Pen
        bluePen.color = "green";
        bluePen.lengthInMm = 250;
        bluePen.write();//używa metody z klasy Pen
        System.out.println("reference variable" + bluePen.color);//bluePen - operator obiektu; .color rodzaj wybieranego parametru
        Pen yellowPen = bluePen; //nie jest tworzony nowy obiekt, tylko referencja wskazuje miejsce w pamięci, skąd te dane są poiberane
        yellowPen.lengthInMm = 200; //ta referencja, mimo że nie jest obiektem, zmodyfikuje zapis na dysku dla oby długopisów
        yellowPen = new Pen(); //nadanie nowej referencji dla żółtego, poprzednia jest rozrywana i tworzony nowy obiekt z nową alokacją pamięci,
        // kolejne modyfikacje żółtego zmienią tylką tą nową wartość
        cecha typu Static sugeruje, że ten parametr ma zastosowanie do każdego obiektu tej klasy

        }
    }
//Pen bluePen - sznureczek (referencja), gdzie znajduje
// się obiekt (w jakiej klasie szukać modelu // + dodanie mu nazwy,
//
// new Pen() - tworzenie nowego obiektu*/
}
