package day8;

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private  int fuel = 0;


    public String toString(){
        return "Изготовитель: " + manufacturer + " , год выпуска: " + year +", длина: "+length+ ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

    static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo){
        if (airplaneOne.length>airplaneTwo.length){
            System.out.println("Первый самолет длинее");
        }else if (airplaneOne.length< airplaneTwo.length){
            System.out.println("второй самолет длинее");
        }
        else {
            System.out.println("Самолеты равны");
        }
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    Airplane(String userManufacturer, int userYear, int userLength, int userWeight) {
        this.year = userYear;
        this.length = userLength;
        this.weight = userWeight;
        this.manufacturer = userManufacturer;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year +", длина: "+length+ ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
}
