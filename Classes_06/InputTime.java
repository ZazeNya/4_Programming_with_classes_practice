import java.util.Scanner;
public class InputTime {
    Scanner scan = new Scanner(System.in);

    public Time createTime() {

        System.out.println("пожалуйста введите количество часов >>");
        int hh = scan.nextInt();
        System.out.println("пожалуйста введите количество минут >>");
        int mm = scan.nextInt();
        System.out.println("пожалуйста введите количество секунд >>");
        int ss = scan.nextInt();

        Time t = new Time(hh, mm, ss);

        return t;
    }

    public void changeTime(Time t) {

        TimeLogic logic = new TimeLogic();

        System.out.println("Какое из значений вы хотите изменить? " + "\n" +
                "h - часы" + "\n" + "m - минуты" + "\n" +
                "s - секунды" + "\n");

        String choice = scan.next();

        switch (choice) {

            case "h":
                System.out.println("пожалуйста введите новое количество часов >>");
                int h = scan.nextInt();
                logic.changeHours(t, h);
                break;

            case "m":
                System.out.println("пожалуйста введите новое количество минут >>");
                int m = scan.nextInt();
                logic.changeMinutes(t, m);
                break;

            case "s":
                System.out.println("пожалуйста введите новое количество секунд >>");
                int s = scan.nextInt();
                logic.changeSeconds(t, s);

                break;

        }
    }
}
