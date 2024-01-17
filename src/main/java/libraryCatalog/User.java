package libraryCatalog;

import java.util.Arrays;
//Dodaj metodę returnBook(Book book) przyjmującą obiekt klasy Book, która oznaczy książką jako dostępną do wypożyczenia,
// przez zmianę atrybutu available na wartość true, usunie z tablicy books obiektu User obiekt Book
//Dodaj metodę returnAllBooks(), która dokona zwrotu wszystkich posiadanych książek.
public class User extends Person {
    Book[] userBooks;

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.userBooks = new Book[0];
    }

    void addBook(Book book) {
        if (book.getAvailability() == true) {
            Book[] temporaryBooks = Arrays.copyOf(this.userBooks, this.userBooks.length + 1);
            temporaryBooks[temporaryBooks.length - 1] = book;
            this.userBooks = temporaryBooks;
            book.setAvailability(false);
            book.increaseBookPopularity();
        } else {
            System.out.println("Book " + "\"" + book.getTitle() + "\"" + " is unavailable.");
        }
    }
    void returnBook(Book book) {
        for (int i = 0; i < this.userBooks.length; i++) {
            if (this.userBooks[i] == book) {
                book.setAvailability(true);
                this.userBooks[i] = null;
            }
        }
    }
    void returnAllBooks() {
        for (Book book : this.userBooks) {
            if (book != null) {
                book.setAvailability(true);
            }
        }
        this.userBooks = new Book [0];
    }
    public String getUserInfo (){
        String booksInRentalString = "A";
            for (Book book : this.userBooks){
                if (book != null) {
                booksInRentalString += book.getBookInfo() + "\n";
                }
            }
        if (booksInRentalString == "A"){
            booksInRentalString = "This user has no books in rental\n";
        }
        String userInfo = String.format("User %1$d info: %2$s\n---Books in rental---\n%3$s---End of books in rental of user %1$d---\n",this.gePersonId(), this.getPersonInfo(), booksInRentalString);
        return userInfo;
    }
}
