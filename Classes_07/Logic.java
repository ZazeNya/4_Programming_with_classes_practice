public class Logic {
    public double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {

        return ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    public double calculateTrianglePerimeter(double x1, double y1, double x2, double y2, double x3, double y3) {

        double a = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        double b = Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
        double c = Math.sqrt(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1)));

        return a + b + c;
    }

    public String findIntersectionPointsMedians (double x1, double y1, double x2, double y2, double x3, double y3) {

        String res;

        double хо = (x1 + x2 +x3) / 3;
        double	уо = (y1 + y2 + y3) / 3;

        res = "x = " + хо + ", " + "y = " + уо;

        return res;
    }
}
