import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public class Skeleton extends Karakter {

    public Skeleton(String filename, int posX, int posY) {
        super(filename, posX, posY, false);
    }
   public int[] getStats() {
       Random rnd = new Random();
        int[] stats = new int[3];
        int d6 = rnd.nextInt(6)+1;
        stats[0] = 2 * characterLevel * d6;
        int d7 = rnd.nextInt(6)+1;
        stats[1] = characterLevel/2 * d7;
        int d8 = rnd.nextInt(6)+1;
        stats[2] = characterLevel * d8;

        return stats;
    }
}
