import java.io.*;
/* Задача 9
   Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
   метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
   методами. Задать критерии выбора данных и вывести эти данные на консоль.
   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
   Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Book book1 = new Book(123486, "Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly", 2015, 688, 45, "твердый");
        Book book2 = new Book(459258, "Thinking In Java", "Bruce Eckel", "MindView", 2006, 1079, 43, "твердый");
        Book book3 = new Book(284925, "An Interdisciplinary Approach", "Robert Sedgewick", "Princeton University", 2017, 1074, 69, "твердый");
        Book book4 = new Book(159284, "Core Java Volume I--Fundamentals", "Cay Horstmann", "Pearson", 2018, 866, 39, "твердый");
        Book book5 = new Book(353159, "Core Java, Volume II--Advanced Features", "Cay Horstmann", "Pearson", 2016, 978, 46, "твердый" );

        Library library = new Library();
        Logic logic = new Logic();
        View view = new View();

        library.addBook(book1, book2, book3, book4, book5);

        System.out.println("Список книг заданного автора - Cay Horstmann: ");
        logic.sortListOfBooksByAuthor(library.getLibrary());
        view.printAuthor(library.getLibrary());

        System.out.println("Список книг, выпущенных заданным издательством - MindView: ");
        logic.sortListOfBooksByPublishing(library.getLibrary());
        view.printPublishing(library.getLibrary());

        System.out.println("Список книг, выпущенных после заданного года - 2015: ");
        logic.sortListOfBooksPublishingByYear(library.getLibrary());
        view.printPublishing(library.getLibrary());

        }
}
