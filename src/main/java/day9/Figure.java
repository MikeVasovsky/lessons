package day9;

import java.util.Scanner;

public abstract class Figure {
    String color;
    public Figure(String color){this.color=color;}
    public String getColor(){return color;}
    public abstract double area();
    public abstract double perimeter();


}
