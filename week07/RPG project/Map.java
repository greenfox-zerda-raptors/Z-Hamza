import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class Map {

    ArrayList<GameObject> tileField;
    ArrayList<Skeleton> Skeletons = new ArrayList<>();
    Boss levelBoss;

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
        Random rnd = new Random();
        int numberofEnemies = rnd.nextInt(4)+3;
        createEnemies(numberofEnemies);

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
        for(GameObject iskeleton : Skeletons){
            iskeleton.draw(graphics);
        }
        levelBoss.draw(graphics);
    }

    public ArrayList<GameObject> getTileField() {
        return tileField;
    }

    public int whatIsIt(int xPos, int yPos){
        try {
            if( levelOne[xPos][yPos] >= 1) {
                return 1;
            }
            else{
                return 0;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }

    }
    public int[][] getLevelOne() {
        return levelOne;
    }



// - - - - -  Creating the random enemies - - - - - - -

    public int getnumberofFloors(int[][] mapLayout){
        int number = 0;

        for (int i = 0; i < mapLayout.length; i++) {
            for (int j = 0; j < mapLayout[0].length; j++) {
                if (mapLayout[i][j] == 1) {
                    number ++;
                }
            }
        }
        return number;
    }
    public int[][] getViableCoords(int[][] mapLayout){
        int counter = 0;
        int numberofFloors = getnumberofFloors(levelOne);
        int[][] result = new int[numberofFloors][2];
        for(int i = 0; i < levelOne.length; i++){
            for(int j = 0; j<levelOne[0].length; j++){
                if(levelOne[i][j] == 1){
                    result[0+counter][0] = j;
                    result[0+counter][1] = i;
                    counter ++;
                }
            }
        }

        return result;
    }


    public void createEnemies(int numberofEnemies){

        Random rnd = new Random();
        int[][] coord = getViableCoords(levelOne);
        for(int i = 0; i < numberofEnemies; i++){
            int random = rnd.nextInt(getnumberofFloors(levelOne));
            Skeletons.add(new Skeleton("images/skeleton.png", coord[random][0], coord[random][1]));

        }
        int random = rnd.nextInt(getnumberofFloors(levelOne)+1);
        this.levelBoss = new Boss("images/boss.png", coord[random][0], coord[random][1]);
    }


    public boolean isThereEnemy(int x, int y){

        int[][] coord = new int[Skeletons.size()][2];
        int counter = 0;
        for(int i = 0; i < coord.length; i ++){
            Skeletons.get(i).getPosY();
            if(Skeletons.get(i).getPosX() == x && Skeletons.get(i).getPosY() == y){
                return true;
            }else if(levelBoss.getPosX() == x && levelBoss.getPosY() == y){
                return true;
            }
        }
       return false;

    }
    public Enemy findEnemy(int x, int y){
        int number =0;
        for(int i = 0; i < Skeletons.size(); i ++){
            if(Skeletons.get(i).getPosX() == x && Skeletons.get(i).getPosY() == y){
                number = i;
                return Skeletons.get(number);
            }
            else if(levelBoss.getPosX() == x && levelBoss.getPosY() == y){
                return levelBoss;
            }
        }

        return null;

    }

    public ArrayList<Skeleton> getSkeletons() {
        return Skeletons;
    }

    public Boss getLevelBoss() {
        return levelBoss;
    }
}
