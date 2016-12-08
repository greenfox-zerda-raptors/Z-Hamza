import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zoltán on 2016.12.08..
 */
abstract public class Enemy extends Karakter{
    String enemyImg;

    Random rnd = new Random();
    int healthPoint;
    int currentHealthPoint;
    int strikePoint;
    int defensePoint;
    int characterLevel =1;



    public Enemy(String filename, int posX, int posY, boolean isMoveable, int [] stats) {
        super(filename, posX, posY, isMoveable, stats);
        this.enemyImg = filename;
    }

    public Enemy(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }




}