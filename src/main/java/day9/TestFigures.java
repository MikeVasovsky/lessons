package day9;

import java.util.Random;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    static double sumOfPerimetres;
    static double sumOfArea;

    public static double calculateRedPerimeter(Figure[] figures) {
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                sumOfPerimetres += figure.perimeter();

            }
        }
        return sumOfPerimetres;
    }

    public static double calculateRedArea(Figure[] figures) {
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                sumOfArea += figure.area();

            }
        }
        return sumOfArea;
    }
}