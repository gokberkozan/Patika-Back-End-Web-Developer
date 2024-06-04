import java.util.Comparator;
import java.lang.String;

public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    // Constructor
    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // Override compareTo method to sort books by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}