import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

/* Задача 1
    Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения
    этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод,
    который находит наибольшее значение из этих двух переменных.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        Test1 test=new Test1(x,y);
        test.calculateSum(test.getX(), test.getY());
        test.findMax(test.getX(), test.getY());
        test.printX(test.getX());
        test.printY(test.getY());
        test.printSum(test.calculateSum(test.getX(), test.getY()));
        test.printMax(test.findMax(test.getX(), test.getY()));
    }

}
