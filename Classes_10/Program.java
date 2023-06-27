import java.io.*;
/* Задача 10
    Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
    методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
    конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
	Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
	Найти и вывести:
	a) список рейсов для заданного пункта назначения;
	b) список рейсов для заданного дня недели;
	c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Airline flight1 = new Airline("Лондон", 1111, "Аэробус", "04:00", "понедельник");
        Airline flight2 = new Airline("Париж", 2211, "Боинг", "17:00", "вторник");
        Airline flight3 = new Airline("Минск", 1313, "Аэробус", "08:00", "вторник");
        Airline flight4 = new Airline("Париж", 1514, "Аэробус", "19:00", "среда");
        Airline flight5 = new Airline("Москва", 8987, "Аэробус", "10:00", "пятница");

        Airlines airlines = new Airlines();
        Logic logic = new Logic();
        View view = new View();

        airlines.addAirline(flight1, flight2, flight3, flight4, flight5);

        System.out.println("Список рейсов для заданного пункта назначения - Париж: ");
        logic.sortListOfAirlinesByDestination(airlines.getAirline());
        view.printByDestination(airlines.getAirline());

        System.out.println("Список рейсов для заданного дня недели - вторник: ");
        logic.sortListOfBooksByWeekday(airlines.getAirline());
        view.printByWeekday(airlines.getAirline());

        System.out.println("Список рейсов для заданного дня недели, время вылета для которых больше 7:00 : ");
        logic.sortListOfBooksByWeekdayAndTime(airlines.getAirline());
        view.printByTime(airlines.getAirline());
        }
}
