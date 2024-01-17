package libraryCatalog;
//Zmodyfikuj klasę Book:
//Dodaj prywatny atrybut popularity który będzie przechowywał ilość wypożyczeń, ilość ta powinna się zwiększać o 1 z każdym wypożyczeniem.
//Zdefiniuj metodę equals(Book book), która na podstawie atrybutu id zwróci informacje czy obiekty są równe.

public class Book {
    private int id;
    private String title;
    private boolean available;
    private int popularity;
    Author author;
    Author[] additionalAuthors;


    public Book (int id, String title, Author author, Author[] additionalAuthors){
        this.id = id;
        this.title = title;
        popularity = 0;
        available = true;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }
    public String getTitle (){
        return this.title;
    }
    public void setAvailability (boolean availability){
        this.available = availability;
    }
    public boolean getAvailability (){
        return this.available;
    }

    public void increaseBookPopularity (){
        this.popularity += 1;
    }
    public String getBookInfo (){
        String authorString = this.author.getAuthorInfo();
        String additionalAuthorsString = "";
        for (Author author : this.additionalAuthors){
            additionalAuthorsString += author.getAuthorInfo() + " ";
        }
        String bookInfo = String.format("'%1$s' book info: \nAuthor: %2$s\nAdditional Authors: %3$s\nPopularity: %4$d\nAvailable: %5$b\n---------\n", this.title, authorString, additionalAuthorsString, this.popularity, this.available);
        return bookInfo;
    }
//    public Book createBook (int id, String title, Author author1, Author author2, Author author3, Book book) {
//        Author[] arrWithAddAuthorsOfBook4 = {author2, author3};
//        book = new Book(id, title, author1, arrWithAddAuthorsOfBook4);
//        return book;
//    }
}
