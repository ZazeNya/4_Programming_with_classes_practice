import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

/* Задача 3
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
    успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
    Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные
    только 9 или 10.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = 10;
        Student students[] = new Student[numberOfStudents];
        Student view=new Student();
        students[0] = new Student("A.January", 2);
        students[1] = new Student("B.February", 1);
        students[2] = new Student("C.March", 3);
        students[3] = new Student("D.April", 1);
        students[4] = new Student("E.May", 1);
        students[5] = new Student("F.June", 3);
        students[6] = new Student("G.July", 2);
        students[7] = new Student("H.August", 2);
        students[8] = new Student("I.September", 3);
        students[9] = new Student("J.October", 2);

        students[0].addGrade(5, 8, 9, 6, 8);
        students[1].addGrade(9, 7, 9, 6, 8);
        students[2].addGrade(9, 7, 9, 6, 8);
        students[3].addGrade(9, 10, 9, 9, 10);
        students[4].addGrade(8, 7, 9, 7, 8);
        students[5].addGrade(5, 7, 6, 6, 8);
        students[6].addGrade(8, 9, 7, 8, 8);
        students[7].addGrade(10, 10, 9, 9, 10);
        students[8].addGrade(7, 6, 7, 6, 8);
        students[9].addGrade(8, 6, 8, 7, 9);

        view.printStudents(students);
        view.selectGradesFrom9(students);
    }
}
