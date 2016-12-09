import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class Map {

    ArrayList<GameObject> tileField;
    ArrayList<Enemy> Enemies = new ArrayList<>();
    int maplevel;

    MapLayout mapArr = new MapLayout();

    int[][] currentMap;

    public Map(int level) {
        this.maplevel = level;
        this.currentMap = mapArr.getMap(level-1);
        Random rnd = new Random();
        int numberofEnemies = rnd.nextInt(3)+3+maplevel;
        createEnemies(numberofEnemies);

        tileField = new ArrayList<GameObject>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (currentMap[i][j] >= 1) {
                    tileField.add(new Floor(j, i));
                } else if (currentMap[i][j] == 0) {
                    tileField.add(new Wall(j, i));
                }
            }
        }
    }

    public void draw(Graphics graphics){
        for (GameObject tile : tileField) {
            tile.draw(graphics);
        }
        for(GameObject iskeleton : Enemies){
            iskeleton.draw(graphics);
        }
    }

    public ArrayList<GameObject> getTileField() {
        return tileField;
    }

    public int whatIsIt(int xPos, int yPos){
        try {
            if( currentMap[xPos][yPos] >= 1) {
                return 1;
            }
            else{
                return 0;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }

    }
    public int[][] getCurrentMap() {
        return currentMap;
    }



// - - - - -  Creating the random enemies - - - - - - -

    public int getNumberofFloors(int[][] mapLayout){
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
        int numberofFloors = getNumberofFloors(currentMap);
        int[][] result = new int[numberofFloors][2];
        for(int i = 0; i < currentMap.length; i++){
            for(int j = 0; j< currentMap[0].length; j++){
                if(currentMap[i][j] == 1){
                    result[0+counter][0] = j;
                    result[0+counter][1] = i;
                    counter ++;
                }
            }
        }

        return result;
    }


    public void createEnemies(int numberofEnemies){

        int[][] coord = getViableCoords(currentMap);
        int[] randomNumber = generateRandom(coord.length, numberofEnemies+1);
        Enemies.add(new Boss("images/boss.png", coord[randomNumber[0]][0], coord[randomNumber[0]][1]));

        for(int i = 0; i < numberofEnemies; i++){
            Enemies.add(new Skeleton("images/skeleton.png", coord[randomNumber[i+1]][0], coord[randomNumber[i+1]][1]));

        }

    }

    public int[] generateRandom(int maxValue, int numberofRandom){
       ArrayList<Integer> dummyList = new ArrayList<>();
        for(int i = 1; i < maxValue; i++){
            dummyList.add(i);
        }
        Random rand = new Random();
        while(dummyList.size() > numberofRandom) {
            int index = rand.nextInt(dummyList.size());
            dummyList.remove(index);
        }
        int[] result = new int[numberofRandom+1];

        for(int j = 0; j < numberofRandom; j++ ){
            result[j] = dummyList.get(j);
        }
        return result;

    }


    public boolean isThereEnemy(Hero hero){
        int x = getHeroPosXY(hero)[0];
        int y = getHeroPosXY(hero)[1];

        int[][] coord = new int[Enemies.size()][2];
        int counter = 0;
        for(int i = 0; i < coord.length; i ++){
            Enemies.get(i).getPosY();
            if(Enemies.get(i).getPosX() == x && Enemies.get(i).getPosY() == y){
                return true;
            }
        }
        return false;

    }
    public Enemy findEnemy(Hero hero){

        int x = getHeroPosXY(hero)[0];
        int y = getHeroPosXY(hero)[1];

        int number =0;
        for(int i = 0; i < Enemies.size(); i ++){
            if(Enemies.get(i).getPosX() == x && Enemies.get(i).getPosY() == y){
                number = i;
                return Enemies.get(number);
            }
        }

        return null;

    }
    public int getSkeletonNumber(Hero hero){

        int x = getHeroPosXY(hero)[0];
        int y = getHeroPosXY(hero)[1];

        int number =0;
        for(int i = 0; i < Enemies.size(); i ++){
            if(Enemies.get(i).getPosX() == x && Enemies.get(i).getPosY() == y){
                number = i;
                return number;
            }
        }

        return 0;

    }

    public void enemyDeath(Hero hero){

        Enemies.get(getSkeletonNumber(hero));

    }

    public int[] getHeroPosXY(Hero hero){
        int[] posXY = new int[]{hero.getPosX(), hero.getPosY()};
        return posXY;
    }
    public boolean areAllDead(){
        int c = 0;
        int size = Enemies.size();
        for(int i = 0; i<size; i++){
            if(Enemies.get(i).isAlive == false){
                c++;
            }
        }
        if(c == size){
            return true;
        }else{
            return false;
        }
    }

    public Enemy getLevelBoss() {
        return Enemies.get(0);
    }
}
