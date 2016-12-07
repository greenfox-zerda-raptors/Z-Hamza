import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class Map {

    ArrayList<GameObject> tileField;
    int[][] levelOne = new int[][]{
            {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
    };

    public Map() {


        tileField = new ArrayList<GameObject>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (levelOne[i][j] >= 1) {
                    tileField.add(new Floor(j, i));
                } else if (levelOne[i][j] == 0) {
                    tileField.add(new Wall(j, i));
                }
            }
        }
    }

    public void draw(Graphics graphics){
        for (GameObject tile : tileField) {
            tile.draw(graphics);
        }
    }
    public int whatIsIt(int xPos, int yPos){
        try {
            return levelOne[xPos][yPos];
        }catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }

    }

}
