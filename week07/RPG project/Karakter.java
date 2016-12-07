/**
 * Created by Zoltán on 2016.12.05..
 */
public class Karakter extends GameObject {
    boolean isMoveable;

    public Karakter(String filename, int posX, int posY, boolean isMoveable) {
        super(filename, posX, posY);
        this.isMoveable = isMoveable;
    }

}
