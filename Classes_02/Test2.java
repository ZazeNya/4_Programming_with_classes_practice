public class Test2 {
    private int x;
    private int y;

    public Test2() {
    }

    public Test2 (int x, int y) {
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
}
