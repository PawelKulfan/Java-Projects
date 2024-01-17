package variousExcersises;

public class BookEmpty {
    public String trescKsiazki;
    private static final String[] VALID_AUTHORS = {"Marek", "Stefan", "Gienek"};
    private String name;
    private boolean isCoverOn = true;
    private double price = 44.32;
    private String author;

    public void setCoverOn(){
        this.isCoverOn = true;
    }
    public void setCoverOff(){
        this.isCoverOn = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {//bezpieczny setter, który sprawdza czy wpisywany author jest z prawidłowego zakresu
        for (String validAuthor : VALID_AUTHORS) {
            if (validAuthor.equals(VALID_AUTHORS)) {//equals porównywanie stringów
                this.author = author;
                return;
            } else {
                throw new IllegalArgumentException("Niepoprawny autor");
            }
        }
    }
        public double getPrice () {
            return price;
        }
        public void tresc () {//printuje stały tekst + zmienną w zależności od parametru trescKsiazki przypisanego do danej ksiązki
           if(isCoverOn){//sprawdzenie, czy okładka jest zamknięta, więc nie da się przeczytać
               return;
           }
            System.out.println("Treść tej książki to " + this.trescKsiazki + "na stronach 1-5");
        }
        public void printInfo () {
            String bookInfo = this.author + " " + this.name;
            System.out.println(bookInfo);
        }
        public String toString () {
            String bookInfo2 = this.author + " " + this.name;
            return bookInfo2;
        }
    }

