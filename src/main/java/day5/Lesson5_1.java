package day5;

public class Lesson5_1 {
    public static void main(String[] args) {
        car bmw = new car();
        bmw.setColor("yellow");
        bmw.setModel("BMW");
        bmw.setYear(2000);
        System.out.println("Цвет автомобиля: "+bmw.getColor());
        System.out.println("Модель автомобиля: "+bmw.getModel());
        System.out.println("Год выпуска автомобиля: "+bmw.getYear());
    }
}

     class car{
        private String model;
        private String color;
        private int year;

        public void setModel(String carModel){
            model = carModel;
        }
        public String getModel(){
            return model;
        }
        public void setColor(String carColor){
            color = carColor;
        }
        public String getColor(){
            return color;
        }
        public  void setYear(int carYear){
            year=carYear;
        }
        public int getYear(){
            return year;
        }
    }

