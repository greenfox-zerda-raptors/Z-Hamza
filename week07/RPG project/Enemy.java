/**
 * Created by Zoltán on 2016.12.08..
 */
abstract public class Enemy extends GameCharacter {
    String enemyImg;

    public Enemy(String filename, int posX, int posY, boolean isMoveable, int [] stats) {
        super(filename, posX, posY, isMoveable, stats);
        this.enemyImg = filename;
    }
    public Enemy(String fileName, int[] stats){
        super(fileName, stats);
    }




}