import java.util.Objects;

public class Test1 {
    private int x;
    private int y;
    public Test1 () {
    }

    public Test1 (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void printX(int x) {
        System.out.println("x = " +  x);
    }

    public void printY(int y) {
        System.out.println("y = " +  y);
    }

    public void printSum(int sum) {
        System.out.println("sum = " + sum);
    }

    public void printMax(int max) {
        System.out.println("max = " + max);
    }
    public int calculateSum(int x, int y) {
        return x + y;
    }

    public int findMax(int x, int y) {
        int result = 0;

        if (x > y ) {
            result = x ;

        } else
            result = y;

        return result;
    }
}
