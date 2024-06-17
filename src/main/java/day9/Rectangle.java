package day9;

public class Rectangle extends Figure{
    double sideA;
    double sideB;
    public Rectangle( double sideA,double sideB,String color){super(color);this.sideA=sideA;this.sideB=sideB;}
    public String getColor() {
        return super.getColor();
    }
    public double area(){
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA+sideB);
    }
}
