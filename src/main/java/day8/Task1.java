package day8;

public class Task1 {
    public static void main (String[] args) {

        String oldString = "0";
        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 20000 + 1; i++) {
           String addString = String.valueOf(i);
           oldString=oldString+" "+addString;
        }
        System.out.println(oldString);
        long stopTime = System.currentTimeMillis();
        long time = stopTime - startTime;
        System.out.println("Длительность работы в мс.: " + time);



        StringBuilder string = new StringBuilder();
        long newStartTime = System.currentTimeMillis();
        for (int i = 0; i<20000+1;i++){
            string.append(i+" ");
        }
        long newStopTime = System.currentTimeMillis();
        long newTime = newStopTime - newStartTime;

        System.out.println("Длительность работы в мс.: " + newTime);


    }


    }
