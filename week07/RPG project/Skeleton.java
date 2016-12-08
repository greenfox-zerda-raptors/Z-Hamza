import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public class Skeleton extends Enemy {




    public Skeleton(String filename, int posX, int posY) {
        super(filename, posX, posY, false, calculateStats(1));

    }

    private static int[] calculateStats(int charLevel) {
        int[] stats = new int[3];
        Random rnd = new Random();
        int d6 = rnd.nextInt(6)+1;
        stats[0] = 2 * charLevel * d6;
        int d7 = rnd.nextInt(6)+1;
        stats[1] = charLevel/2 * d7;
        int d8 = rnd.nextInt(6)+1;
        stats[2] = charLevel * d8;
        return stats;
    }

}
