import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public class Hero extends Karakter {

    int healthPoint;
    int strikePoint;
    int defensePoint;
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY, true);
    }

//    public Karakter(String filename, int posX, int posY, int charlevel, int healthPoint, int strikePoint, int defensePoint)
    public Hero(String image, int posX, int posY){
        super(image, posX, posY, true);
    }


    public int[] getStats() {
        Random rnd = new Random();
        int[] stats = new int[3];
        int d6 = rnd.nextInt(6)+1;
        stats[0] = 20 + 3*d6;
        int d7 = rnd.nextInt(6)+1;
        stats[1] = 2 * d7;
        int d8 = rnd.nextInt(6)+1;
        stats[2] = 5 * d8;

        return stats;
    }


}
