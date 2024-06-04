package day6;

import java.util.Scanner;

public class Task_6_2 {
    public static void main(String[] args) {
        Airplane newAirplane = new Airplane("Pilatus Aircraft", 2000, 7000,0);
        newAirplane.info();
        newAirplane.setLength(3434);
        newAirplane.setYear(2024);
        newAirplane.fillUp(10);
        newAirplane.fillUp(22);
        newAirplane.info();
        System.out.println(newAirplane.getFuel());



    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private static int fuel = 0;
    private int airplaneFuel=0;

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
        System.out.println("Изготовитель: " + manufacturer + " , год выпуска: " + year +", длина: "+length+ ", вес: " + weight + ", количество топлива в баке: " + airplaneFuel);
    }

    int fillUp(int n) {
       return airplaneFuel+=n;
    }
}

