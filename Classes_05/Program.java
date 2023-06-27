import java.io.*;
import java.util.Scanner;


/* Задача 5
    Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
    свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика
    значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и
    уменьшения состояния, и метод позволяющий получить его текущее состояние. Написать код,
    демонстрирующий все возможности класса.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Counter defaultCounter = new Counter();
        Counter log = new Counter();
        Counter view = new Counter();

        view.printСurrentСounterValue("Значения по умолчанию при инициализации счетчика \nИнициализированный счетчик: ", defaultCounter.showCounter());

        for (int i = 0; i < 12; i++) 
            defaultCounter.setCount(log.increase(defaultCounter.getMinValue(), defaultCounter.getMaxValue(), defaultCounter.getCount()));

        view.printСurrentСounterValue("Счетчик после увеличения: ", defaultCounter.showCounter());
        defaultCounter.setCount(log.decrease(defaultCounter.getMinValue(), defaultCounter.getMaxValue(), defaultCounter.getCount()));
        view.printСurrentСounterValue("Счетчик после уменьшения: ", defaultCounter.showCounter());
        System.out.println();
        Counter arbitraryCounter = new Counter(10, 40, 12);
        view.printСurrentСounterValue("Инициализация произвольными значениями \nИнициализированный счетчик: ", arbitraryCounter.showCounter());
        for (int i = 0; i < 10; i++)
            arbitraryCounter.setCount(log.increase(arbitraryCounter.getMinValue(), arbitraryCounter.getMaxValue(), arbitraryCounter.getCount()));
        view.printСurrentСounterValue("Счетчик после увеличения: ", arbitraryCounter.showCounter());
        arbitraryCounter.setCount(log.decrease(arbitraryCounter.getMinValue(), arbitraryCounter.getMaxValue(), arbitraryCounter.getCount()));
        view.printСurrentСounterValue("Счетчик после уменьшения: ", arbitraryCounter.showCounter());
    }
}
