import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class Map  {

    private static String skeletonImg ="images/skeleton.png" ;
    private static String bossImg = "images/boss.png";

    ArrayList<GameObject> tileField;

    ArrayList<Enemy> Enemies = new ArrayList<>();

    int maplevel;
    MapLayout mapArr = new MapLayout();
    int[][] currentMap;

    public Map(int level) {

        this.maplevel = level;
        this.currentMap = mapArr.getMap(level-1);
        mapArr.addRandomMap();
        Random rnd = new Random();
        int numberofEnemies = rnd.nextInt(3+maplevel)+3;
        createEnemies(numberofEnemies);
        setTileField(currentMap);

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

    public int isItWall(int xPos, int yPos){
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

    private void setTileField(int[][] currentMap){
        ArrayList<GameObject> result = new ArrayList<GameObject>();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (currentMap[i][j] >= 1) {
                    result.add(new Floor(j, i));
                } else if (currentMap[i][j] == 0) {
                    result.add(new Wall(j, i));
                }
            }
        }
        this.tileField = result;
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
        Enemies.add(new Boss(bossImg, coord[randomNumber[0]][0], coord[randomNumber[0]][1]));

        for(int i = 0; i < numberofEnemies; i++){
            Enemies.add(new Skeleton(skeletonImg, coord[randomNumber[i+1]][0], coord[randomNumber[i+1]][1]));

        }
    }

    public void scaleEnemies(int level){
        Random rnd = new Random();
        int d3 = rnd.nextInt(6)+level;
        Enemies.get(0).monsterLvLUp(d3+level);
        for(int i = 1; i < Enemies.size(); i++){
            int d2 = rnd.nextInt(3)+level;
            Enemies.get(i).monsterLvLUp(d2+level);
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

    public void drawLevel(Graphics graphics){
        graphics.setFont(new Font("Courier New", Font.BOLD, 28));
        graphics.drawString("MAP: " + getMaplevel(), 800,40);
    }

    public ArrayList<Enemy> getEnemies() {
        return Enemies;
    }

    public int[][] getCurrentMap() {
        return currentMap;
    }

    public int getMaplevel() {
        return maplevel;
    }

    public Map(SaveLoadTxt saved){
        this.maplevel = saved.getMaplevel();
        this.currentMap = saved.getMapLayout();
        setTileField(saved.getMapLayout());
        this.Enemies = convertToEnemiesArray(saved.getStoredStats());
        mapArr.addRandomMap();
    }

    public ArrayList<Enemy> convertToEnemiesArray(ArrayList<int[]> stats){
       ArrayList<Enemy> result = new ArrayList<>();

        Boss boss = new Boss(bossImg, stats.get(1));
        result.add(boss);

        for(int i = 2; i < stats.size(); i++){
            Skeleton skeleton = new Skeleton(skeletonImg,stats.get(i));
            result.add(skeleton);
        }

        return result;
    }

    public MapLayout getMapArr() {
        return mapArr;
    }

}
