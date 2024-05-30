


public class Lesson5_2 {
    public static void main(String[] args) {
        Motocycle yamaha = new Motocycle("Yamaha","Red", 2000);
        System.out.println("Цвет мотоцикла: "+yamaha.getColor());
        System.out.println("Модель мотоцикла: "+yamaha.getModel());
        System.out.println("Год выпуска мотоцикла: "+yamaha.getYear());
    }
}
 class Motocycle{
     private String model;
     private String color;
     private int year;

     public Motocycle(String motoModel, String motoColor,int motoYear ){
         this.color=motoColor;
         this.year=motoYear;
         this.model=motoModel;
     }

     public String getModel() {
         return model;
     }

     public String getColor() {
         return color;
     }

     public int getYear() {
         return year;
     }
 }







