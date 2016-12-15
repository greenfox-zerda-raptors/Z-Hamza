import java.io.*;
import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.15..
 */
public class SaveLoadTxt {
    private String fileName = "saveTest.txt";
    private String filepath = "C:\\Users\\Zoltán\\Desktop\\Game\\";

    private Hero mainhero;
    private Map currentMap;
    private int maplevel;


    private ArrayList<int[]> storedStats = new ArrayList<>();
    private int[][] mapLayout = new int[11][10];

    ArrayList<int[]> loadStats = new ArrayList<>();
    int[][] mapLayoutLoad = new int[11][10];


    private ArrayList<String> containerList = new ArrayList<>();

    public SaveLoadTxt(Hero mainhero, Map currentMap) {
        this.mainhero = mainhero;
        this.currentMap = currentMap;
    }
    public SaveLoadTxt(Hero mainhero, Map currentMap, String saveFileName){
        this(mainhero, currentMap);
        this.fileName = saveFileName;
    }

    public void saveNow(){
        ArrayList<int[]> tempStorage = new ArrayList<>();
        //        - - - - - -  Map values - - -  - - - - - -

        int mapLvl = currentMap.getMaplevel();
        this.maplevel = mapLvl;
        this.mapLayout = currentMap.getCurrentMap();
        ArrayList<Enemy> enemiesList = currentMap.getEnemies();

//      - - - - - - -  - - Hero values - - - - - - - - - - -
        int[] heroStats = new int[]{
                mainhero.getPosX(), mainhero.getPosY(),
                mainhero.getCharacterLevel(), 1,
                mainhero.getHealthPoint(), mainhero.getCurrentHealthPoint(),
                mainhero.getStrikePoint(), mainhero.getDefensePoint(),

        };
        tempStorage.add(heroStats);

//       - - - - - -   Monster values one by one - - - - - - - -
        Enemy currentBoss = enemiesList.get(0);

//      -  - - - - -  - -   Boss stats - - - - -
        int[] bossStats = new int[]{
                currentBoss.getPosX(), currentBoss.getPosY(),
                currentBoss.getCharacterLevel(), currentBoss.isAliveInt(),
                currentBoss.getHealthPoint(), currentBoss.getCurrentHealthPoint(),
                currentBoss.getStrikePoint(), currentBoss.getDefensePoint()
        };
        tempStorage.add(bossStats);

//        - - - - - - Skeleton stats - - - -  -
        for(int i = 1; i < enemiesList.size(); i++){
            int[] skeletonStatDummy = new int[]{
                    enemiesList.get(i).getPosX(), enemiesList.get(i).getPosY(),
                    enemiesList.get(i).getCharacterLevel(), enemiesList.get(i).isAliveInt(),
                    enemiesList.get(i).getHealthPoint(), enemiesList.get(i).getCurrentHealthPoint(),
                    enemiesList.get(i).getStrikePoint(), enemiesList.get(i).getDefensePoint(),
            };
            tempStorage.add(skeletonStatDummy);
        }
        this.storedStats = tempStorage;
        this.writeToFile();
    }

    public void writeToFile(){


        BufferedWriter bw = null;
        File file = new File(filepath+fileName);
        file.delete();


        try {
            FileWriter fw = new FileWriter(file.getName());
            bw = new BufferedWriter(fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            bw.write(content);
            for(int j = 0; j < mapLayout[0].length; j++){
                bw.write(writeToLine(mapLayout[j]));
                bw.newLine();
            }
            bw.newLine();
            for(int k = 0; k < storedStats.size(); k++) {
                int[] dummy = storedStats.get(k);
                bw.write(writeToLine(dummy));
                bw.newLine();
            }
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("Saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private String writeToLine(int[] intArr){
        String result = "";
        for(int i = 0; i<intArr.length; i++ ){
            result += intArr[i] + " ";
        }
        return result;
    }

    public void loadfromFile(){

       containerList = new ArrayList<>();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath+fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String line = br.readLine();
            System.out.println(line);
            while (line != null) {

                String line1 = line;
                System.out.println(line);
                containerList.add(line1);
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        gettingValuesfromLoaded();
    }

    private void gettingValuesfromLoaded(){

        for(int i = 0; i < 11; i ++){
            mapLayoutLoad[i] = convertStringtoIntArr(containerList.get(0));
        }
        for(int j = 12; j < containerList.size()-1; j++ ){
            loadStats.add(convertStringtoIntArr(containerList.get(j)));
        }
    }

    private int[] convertStringtoIntArr(String string){

        String[] parts = string.split(" ");
        int[] result = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            result[n] = Integer.parseInt(parts[n]);
        }
        return result;
    }

    public ArrayList<int[]> getStoredStats() {
        return storedStats;
    }

    public int[][] getMapLayout() {
        return mapLayout;
    }

    public int getMaplevel() {
        return maplevel;
    }
}
