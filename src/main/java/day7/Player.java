package day7;

public class Player {
    private int stamina;
    private static int countPlayers = 0;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    int run(Player player) {
        while (player.stamina != 0) {
            if (player.stamina > 0) {
                player.stamina --;
                if (stamina == 0) {
                    countPlayers --;
                }
            }
        }
        return countPlayers;
    }

    public void info() {
        int fullComand = 6;
        if (countPlayers < fullComand) {
            int needPlayers = fullComand - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + needPlayers + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
