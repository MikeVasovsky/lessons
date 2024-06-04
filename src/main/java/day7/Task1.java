package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplaneOne = new Airplane("G7",2000,50,1000);
        Airplane airplaneTwo = new Airplane("G8",2000,70,1000);
        Airplane.compareAirplanes(airplaneOne,airplaneTwo);
    }
}
