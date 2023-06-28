package study;

import study.Country;

import java.io.*;
import static study.Database.*;
/* Задача 3
    Создать объект класса Государство, используя классы Область, Район, Город.
    Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
    */
public class Program {
    public static void main(String[] args) throws IOException {
        Country belarus = new Country("Республика Беларусь",regions);
        belarus.printCapital();
        belarus.printNumberRegions();
        belarus.printAreaCountry();
        belarus.printRegionCenter();
        }
}
