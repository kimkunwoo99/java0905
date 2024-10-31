package LibraryProject;

public class Dto {
    private String isbn;
    private String bookname;
    private String author;
    private String publisher;
    private int price;

    public Dto() {}

    public Dto(String isbn, String bookname, String author, String publisher, int price) {
        this.isbn = isbn;
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "isbn='" + isbn + '\'' +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
