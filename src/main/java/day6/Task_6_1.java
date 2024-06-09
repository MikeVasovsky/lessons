package day6;

public class Task_6_1{
    public static void main(String[] args) {
        New_car carNew = new New_car("BMW","Black",2000);
        carNew.info();
        System.out.println(carNew.yearDifference(1990));
    }
}
class New_car {
   private String model;
   private String color;
   private int year;

   New_car(String carModel, String carColor, int carYear){
       this.year=carYear;
       this.model=carModel;
       this.color=carColor;
   }
   void  info(){
       System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear ){
       return Math.abs(inputYear - year);
    }

}

