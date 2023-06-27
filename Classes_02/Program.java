import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

/* Задача 2
    Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
    Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
    методы для полей экземпляра класса.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        Test2 test= new Test2(x,y);
        test.printX(test.getX());
        test.printY(test.getY());
    }

}
