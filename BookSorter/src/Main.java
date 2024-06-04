import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hobbit", 310, "J. R. R. Tolkien", "1937");
        Book book2 = new Book("Harry Potter ve Felsefe Taşı", 223, "J. K. Rowling", "1997");
        Book book3 = new Book("Küçük Prens", 107, "Antoine de Saint-Exupéry", "1943");
        Book book4 = new Book("Da Vinci Şifresi", 528, "Dan Brown", "2003");
        Book book5 = new Book("Kuyucaklı Yusuf", 220, "Sabahattin Ali", "2001");

        // Books are added to a set and sorted by title.
        Set<Book> bookSetByTitle = new TreeSet<>();
        bookSetByTitle.add(book1);
        bookSetByTitle.add(book2);
        bookSetByTitle.add(book3);
        bookSetByTitle.add(book4);
        bookSetByTitle.add(book5);

        // Displaying books in title order
        System.out.println("Books sorted by title:");
        for (Book book : bookSetByTitle) {
            System.out.println(book.getTitle());
        }

        // Creating a Comparator to sort books by pageCount
        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getPageCount);

        // Adding books to a Set sorted by pageCount
        Set<Book> bookSetByPageCount = new TreeSet<>(pageCountComparator);
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        // Books ordered by page count are displayed.
        System.out.println("\nBooks sorted by pageCount:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book.getTitle() + " - " + book.getPageCount() + " pages");
        }
    }
}