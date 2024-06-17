package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player firstPlayer = new Player(random.nextInt(11)+90);
        Player twoPlayer = new Player(random.nextInt(11)+90);
        Player threePlayer = new Player(random.nextInt(11)+90);
        Player fouwPlayer = new Player(random.nextInt(11)+90);
        Player fivePlayer = new Player(random.nextInt(11)+90);
        //   Player sixPlayer = new Player(random.nextInt(11)+90);
        //   Player sevenPlayer = new Player(random.nextInt(11)+90);
        //   Player eightPlayer = new Player(random.nextInt(11)+90);


        System.out.println(Player.getCountPlayers());
        System.out.println(firstPlayer.getStamina());
        System.out.println(Player.getCountPlayers());
        firstPlayer.run(firstPlayer);
        System.out.println(firstPlayer.getStamina());
        System.out.println(Player.getCountPlayers());

        StringBuilder a = new StringBuilder("Hello");
        a.append(" safasf").append("23423");
        System.out.println(a.toString());
    }
}
