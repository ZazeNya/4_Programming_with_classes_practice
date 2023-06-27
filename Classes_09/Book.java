import java.util.Objects;
public class Book {
    private int id;
    private String title;
    private String author;
    private String publishing;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book() {
    }

    public Book (int id, String title, String author, String publishing, int yearOfPublishing,
                 int numberOfPages, int price,String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bindingType, id, numberOfPages, price, publishing, title, yearOfPublishing);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && Objects.equals(bindingType, other.bindingType) && id == other.id
                && numberOfPages == other.numberOfPages && Objects.equals(price, other.price)
                && Objects.equals(publishing, other.publishing) && Objects.equals(title, other.title)
                && yearOfPublishing == other.yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Книга [id=" + id + ", название: " + title + ", автор: " + author + ", издательство: " + publishing
                + ", год публикации: " + yearOfPublishing + ", количество страниц: " + numberOfPages + ", цена: " + price
                + ", переплет: " + bindingType + "]";
    }
}
