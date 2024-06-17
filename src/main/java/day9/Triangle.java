package day9;

public class Triangle extends Figure{
    double lengthA;
    double lengthB;
    double lengthC;

    public String getColor() {
        return super.getColor();
    }

    public Triangle(double lenghtA, double lengthB,double lengthC,String color){
        super(color);
        this.lengthA=lenghtA;
        this.lengthB=lengthB;
        this.lengthC=lengthC;
}
    public double perimeter(){
        return lengthA+lengthB+lengthC;
    }
    public double area(){
        double halfPerimeter=(lengthA+lengthB+lengthC)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-lengthA)*(halfPerimeter-lengthB)*(halfPerimeter-lengthC));
    }


}

