import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public class Boss extends Enemy {

    public Boss(String filename, int posX, int posY) {
        super(filename, posX, posY, false, calculateStats(3));

    }

    private static  int[] calculateStats(int charLevel) {
        Random rnd = new Random();
        int[] stats = new int[3];
        int d6 = rnd.nextInt(6) + 1;
        stats[0]= 2 * charLevel * d6 + d6;
        int d7 = rnd.nextInt(6) + 1;
        stats[1]= charLevel * d7 + d7 / 2;
        int d8 = rnd.nextInt(6) + 1;
        stats[2]= charLevel * d8 + charLevel;
        return stats;
    }

}
