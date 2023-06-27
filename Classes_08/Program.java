import java.io.*;
/* Задача 8
   Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
   set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
   Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и
   вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер
   кредитной карточки, номер банковского счета.
   Найти и вывести:
   a) список покупателей в алфавитном порядке;
   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
    */
public class Program {
    public static void main(String[] args) throws IOException {

        Customer customer1 = new Customer(321, "A.January", "1 One Street", 111000, 721654987);
        Customer customer2 = new Customer(821, "B.February", "2 Two Street", 222111, 321654987);
        Customer customer3 = new Customer(521, "C.March", "3 Three Steet", 333333, 421654987);
        Customer customer4 = new Customer(421, "D.April", "4 Four Street", 222333, 621654987);
        Customer customer5 = new Customer(121, "E.May", "5 Five Street", 555444, 521654987);

        Customers customers = new Customers();
        Logic logic = new Logic();
        View view = new View();

        customers.addCustomers(customer1, customer2, customer3, customer4, customer5);

        System.out.println("Список покупателей в алфавитном порядке: ");
        logic.customersInAlphabeticalOrder(customers.getCustomers());
        view.printCustomer(customers.getCustomers());


        System.out.println("Список покупателей, у которых номер кредитной карточки находится в заданном интервале 200000 - 300000: ");
        logic.sortByCreditCardNumber(customers.getCustomers());
        view.printCustomerbyCreditCard(customers.getCustomers());
    }
}
