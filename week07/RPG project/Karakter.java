
/**
 * Created by Zoltán on 2016.12.05..
 */
public abstract class Karakter extends GameObject {
    boolean isMoveable;

    int characterLevel;
    int healthPoint;
    int defensePoint;
    int strikePoint;


    int currentHealthPoint;

    public Karakter(String filename, int posX, int posY, boolean isMoveable) {
        super(filename, posX, posY);
        int[] stats = getStats();
        this.healthPoint = stats[0];
        this.defensePoint = stats[1];
        this.strikePoint = stats[2];

    }

    public Karakter(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.isMoveable = false;
    }

    abstract int[] getStats();


    public void fight(){

    }

}
