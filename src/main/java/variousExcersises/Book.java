package variousExcersises;

public class Book {
    public String name = "Thinking in Java";
    public double price = 95.99;
    public String author = "Bruce Eckel";
    public void printInfo() {
        String bookInfo = this.author + " " + this.name;
        System.out.println(bookInfo);
    }
    public String toString(){
        String bookInfo2 = this.author + " " + this.name;
        return bookInfo2;
    }
}
