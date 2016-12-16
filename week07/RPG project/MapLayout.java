import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.09..
 */
public class MapLayout {

    ArrayList<int[][]> Maps = new ArrayList<>();

    public MapLayout() {

        for (int i = 0; i < 25; i++) {
            Maps.add(generateRandomMap());
        }

    }

    public int[][] getMap(int number){
        Maps.add(generateRandomMap());
        return Maps.get(number);
    }
    public void addRandomMap (){

        int[][] randomMap = generateRandomMap();
        Maps.add(randomMap);

    }
    public int[][] generateRandomMap(){
        Maze randomMaze = new Maze(11,10);
        randomMaze.generate();
        int[][] result = randomMaze.print();
        result[0][0] = 1;
        return result;
    }
    public ArrayList<int[][]> getMaps() {
        return Maps;
    }

    public void setMaps(ArrayList<int[][]> maps) {
        Maps = maps;
    }
}

//       - - - - - - The original map - - - - - -
//        int[][] levelOne = new int[][]{
//                {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
//                {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
//                {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
//                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
//                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
//                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
//                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
//                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
//                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
//                {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
//                {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
//        };
//        Maps.add(levelOne);
//          - - - - - -  The second map - - - - - - - -
//        int[][] levelTwo = new int[][]{
//                {1, 0, 0, 0, 1, 0, 1, 1, 1, 1},
//                {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
//                {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
//                {1, 1, 1, 1, 1, 0, 1, 0, 0, 1},
//                {0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
//                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
//                {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
//                {1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
//                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
//                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
//                {0, 1, 0, 0, 0, 0, 1, 1, 1, 1}
//        };
//        Maps.add(levelTwo);
