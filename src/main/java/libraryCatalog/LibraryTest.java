package libraryCatalog;


public class LibraryTest {

    public static void main(String[] args) {
        Author author1 = new Author(1, "Adam", "Mickiewicz", "'Ten od Dziadów'");
        Author author2 = new Author(2, "Juliusz", "Słowacki", "'Ten co nie lubił Mickiewicza'");
        Author author3 = new Author(3, "Andrzej", "Sapkowski", "'Hehe, poproszę 20 tys. z góry, hehe'");
        Author author4 = new Author(4, "Feliks W.", "Kres", "'Ten od Pani Dobrego Znaku'");
        Author author5 = new Author(5, "Jacek", "Komuda", "'Ten nieznany'");
        Author[] arrWithAddAuthorsOfBook1 = {author2, author3};
        Book book1 = new Book(1, "Dziady I", author1, arrWithAddAuthorsOfBook1);
        Author[] arrWithAddAuthorsOfBook2 = {author3, author1};
        Book book2 = new Book(2, "Pani Dobrego Znaku", author4, arrWithAddAuthorsOfBook2);
        Author[] arrWithAddAuthorsOfBook3 = {author1, author5};
        Book book3 = new Book(3, "Wiedźmin 1", author3, arrWithAddAuthorsOfBook3);
        User user1 = new User(1, "Paweł", "Kulfan");
        Author[] arrWithAddAuthorsOfSoundBook1 = {author4, author5};
        SoundBook soundBook1 = new SoundBook(1, "Wiedźmin", author3, arrWithAddAuthorsOfSoundBook1,3, 3658);
        User user2 = new User(2, "Andrzej", "Kamiński");
        user1.addBook(book1);
        user1.addBook(book2);
        user2.addBook(book2);
        user2.addBook(book3);
        user1.returnBook(book1);
        user2.addBook(book1);
        user1.returnAllBooks();
        user2.addBook(book2);
        System.out.println(book1.getBookInfo());
        System.out.println(user1.getUserInfo());
        System.out.println(user2.getUserInfo());
    }
}
