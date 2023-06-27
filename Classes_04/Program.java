import java.io.*;
import java.util.Scanner;


/* Задача 4
    Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
    время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
    возможность сортировки элементов массива по номерам поездов. Добавьте возможность
    вывода информации о поезде, номер которого введен пользователем. Добавьте
    возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
    пунктами назначения должны быть упорядочены по времени отправления.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        Train train1 = new Train("Могилев", 1, "06:00");
        Train train2 = new Train("Минск", 4, "07:00");
        Train train3 = new Train("Брест", 3, "08:00");
        Train train4 = new Train("Гродно", 2, "09:00");
        Train train5 = new Train("Витебск", 5, "10:00");

        Depo depo = new Depo();
        Train logic = new Train();
        Train view = new Train();
        Input input = new Input();

        depo.addTrains(train1, train2, train3, train4, train5);

        System.out.println("Вывод на консоль поездов");
        view.printTrain(depo.getTrains());

        System.out.println("Сортировка поездов по номеру");
        logic.sortByNumber(depo.getTrains());
        view.printTrain(depo.getTrains());

        int userNumber;
        userNumber = input.enterFromConsol(depo.getTrains());
        view.printByNumber(depo.getTrains(), userNumber);
    }
    }
