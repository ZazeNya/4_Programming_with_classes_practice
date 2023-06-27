import java.io.*;
/* Задача 7
   Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
   вычисления площади, периметра и точки пересечения медиан.
    */
public class Program {
    public static void main(String[] args) throws IOException {

            double x1 = 3;
            double y1 = 4;
            double x2 = 9;
            double y2 = 8;
            double x3 = 4;
            double y3 = 12;


            Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);

            Logic logic = new Logic();

            System.out.println("Площадь треугольника: ");
            System.out.println( logic.calculateTriangleArea(x1, y1, x2, y2, x3, y3) );

            System.out.println("Периметр треугольника: ");
            System.out.println( logic.calculateTrianglePerimeter(x1, y1, x2, y2, x3, y3) );

            System.out.println("Координаты медианы: ");
            System.out.println( logic.findIntersectionPointsMedians(x1, y1, x2, y2, x3, y3) );
        }
}
