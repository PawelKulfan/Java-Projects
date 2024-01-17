package variousExcersises;

public class PrintBookInfo {
    public static void main(String[] args) {
        BookEmpty book2 = new BookEmpty();
        /*Book book1 = new Book();
        System.out.println(book1);
        book1.printInfo();

        BookEmpty book3 = new BookEmpty();
        System.out.println(book2);
        book2.setAuthor("Genowefa");
        book2.setName("O gotowaniu");
        book2.printInfo();
        System.out.println(book2.getPrice() + " ");
        System.out.println(book2);
        book2.trescKsiazki = "tresc ksiazki book2 ";
        book3.trescKsiazki = "tresc ksiazki book3 ";
        book2.tresc();
        book3.tresc();
        book2.setAuthor("Gienek");
        System.out.println(book2);*/
        book2.setCoverOn();//ustawienie parametru okładki (tu true, więc nie da się czytać)
        book2.trescKsiazki = "tresc ksiazki book2 ";
        book2.tresc();

    }
}
