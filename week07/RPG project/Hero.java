import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public class Hero extends GameCharacter {

    public Hero(String image, int posX, int posY){
        super(image, posX, posY, true, calculateStats());
    }

    public Hero(String image, int[] stats){
        super(image, stats);
    }



    private static int[] calculateStats() {
        Random rnd = new Random();
        int[] stats = new int[3];
        int d6 = rnd.nextInt(6)+1;
        stats[0]= 20 + 3*d6;
        int d7 = rnd.nextInt(6)+1;
        stats[1] = 2 * d7;
        int d8 = rnd.nextInt(6)+1;
        stats[2] = 5*d8;

        return stats;
    }

    public void levelUp(){
        this.setStrikePoint(getStrikePoint() + 6);
        this.setHealthPoint(getHealthPoint() + 10);
        this.setDefensePoint(getDefensePoint() + 2);
    }


}
