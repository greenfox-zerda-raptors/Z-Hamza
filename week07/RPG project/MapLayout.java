import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.09..
 */
public class MapLayout {

    ArrayList<int[][]> Maps = new ArrayList<>();

    public MapLayout() {
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
        Maps.add(levelOne);

        int[][] levelTwo = new int[][]{
                {1, 0, 0, 0, 1, 0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 0, 1, 1, 1, 1}
        };
        Maps.add(levelTwo);
        Maps.add(generateRandomMap());

    }

    public int[][] getMap(int number){
        Maps.add(generateRandomMap());
            return Maps.get(number);
    }
    public void addRandomMap (){
        ArrayList<int[][]> dummy = this.getMaps();
        int[][] randomMap = generateRandomMap();
        dummy.add(randomMap);
        setMaps(dummy);
    }
    public int[][] generateRandomMap(){
        Maze randomMaze = new Maze(11,10);
        randomMaze.generate();
        int[][] result = randomMaze.print();
        return result;
    }
    public void setPosToFloor(int level, int x, int y){
       Maps.get(level)[x][y] = 1;
    }

    public ArrayList<int[][]> getMaps() {
        return Maps;
    }

    public void setMaps(ArrayList<int[][]> maps) {
        Maps = maps;
    }
}

