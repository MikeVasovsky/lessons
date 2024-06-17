package day9;

public class Circle extends Figure{
    @Override
    public String getColor() {
        return super.getColor();
    }

    double rad;
    public Circle (double rad, String color){super(color);this.rad=rad;}
    public double area(){
        return Math.pow(rad,2)*Math.PI;
    }
    public double perimeter(){return 2*Math.PI*rad;}

}
