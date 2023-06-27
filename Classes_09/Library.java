import java.util.Arrays;
public class Library {
    private Book[] library;

    private final static int LENGTH_OF_ARRAY = 5;

    public Library() {
        library = new Book[LENGTH_OF_ARRAY];
    }

    public Book[] getLibrary() {
        return library;
    }

    public static int getLengthOfArray() {
        return LENGTH_OF_ARRAY;
    }

    public Book[] addBook(Book book1, Book book2, Book book3, Book book4,Book book5) {
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        library[4] = book5;

        return library;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(library);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Library other = (Library) obj;
        return Arrays.equals(library, other.library);
    }

    @Override
    public String toString() {
        return "Library [library=" + Arrays.toString(librery) + "]";
    }
}
