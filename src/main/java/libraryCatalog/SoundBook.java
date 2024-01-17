package libraryCatalog;
//Stwórz klasę SoundBook, która ma spełniać następujące wymogi:
//    Mieć prywatne atrybuty:
//    duration - atrybut ten powinien przechowywać długość nagrań,
//    numberOfCarriers - atrybut określający liczbę nośników (płyt CD, kaset) które są zawarte w ramach jednej książki.
//    Zdefiniuj odpowiednie dziedziczenie między klasą SoundBook a klasą Book.
public class SoundBook extends Book{
    int numberOfCarriers;
    int durationInSec;
    public SoundBook (int id, String title, Author author, Author[] additionalAuthors, int numberOfCarriers, int durationInSec) {
        super(id, title, author, additionalAuthors);
        this.numberOfCarriers = numberOfCarriers;
        this.durationInSec = durationInSec;
    }
}
