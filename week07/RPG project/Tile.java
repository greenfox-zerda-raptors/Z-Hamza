/**
 * Created by Zoltán on 2016.12.07..
 */
public class Tile extends GameObject {
    boolean stepabble;
    public Tile(String filename, int posX, int posY, boolean stepabble) {
        super(filename, posX, posY);
        this.stepabble = stepabble;
    }

    public boolean isStepabble() {
        return stepabble;
    }

    public void setStepabble(boolean stepabble) {
        this.stepabble = stepabble;
    }
}
