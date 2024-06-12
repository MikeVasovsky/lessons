package day8;

public class Task1  {
    public static void main (String[] args) {
        StringBuilder string = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<20000+1;i++){
            string.append(i+" ");
        }
        System.out.println(string.toString());
        long stopTime = System.currentTimeMillis();
        long time = stopTime - startTime;
        System.out.println("Длительность работы в мс.: " + time);
    }
}
