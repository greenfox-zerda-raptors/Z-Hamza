import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class Map {
    ArrayList<GameObject> tileField;
    public Map() {
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

        tileField = new ArrayList<GameObject>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (levelOne[i][j] >= 1) {
                    tileField.add(new Floor(j, i));
//                    unnecessary
                    if (levelOne[i][j] == 2) {
                        tileField.add(new Hero(j, i));
                    }
                } else if (levelOne[i][j] == 0) {
                    tileField.add(new Wall(j, i));
                } else if (levelOne[i][j] == 2) {
                    tileField.add(new Hero(j, i));
                }
            }
        }
    }
    public ArrayList<GameObject> getTileField(){
        return tileField;
    }
    public void draw(Graphics graphics){
        for (GameObject tile : tileField) {
            tile.draw(graphics);
        }
    }

}
