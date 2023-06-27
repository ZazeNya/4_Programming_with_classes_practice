import java.io.*;
/* Задача 6
    Составьте описание класса для представления времени. Предусмотрите возможности установки
    времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости
    вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
    Создать методы изменения времени на заданное количество часов, минут и секунд.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        View view = new View();
        InputTime input = new InputTime();
        Time t;

        t = input.createTime();
        view.printCurrentTime(t.toString());

        input.changeTime(t);
        view.printChangedTime(t.toString());
    }
}
