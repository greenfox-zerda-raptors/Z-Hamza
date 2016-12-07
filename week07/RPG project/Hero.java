/**
 * Created by Zoltán on 2016.12.05..
 */
public class Hero extends Karakter {


    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY, true);
    }
    public Hero(String image, int posX, int posY){
        super(image, posX, posY, true);
    }

}
