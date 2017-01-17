import java.util.Random;

/**
 * Created by Zoltán on 2017.01.17..
 */
public class GameOfLife {

    private int[][] cellField;


    public GameOfLife() {

    }

    public GameOfLife(int x, int y) {
        int[][] cellField = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cellField[i][j] = 0;
            }

        }
        this.cellField = cellField;
    }

    public GameOfLife(int[][] cellField) {
        this.cellField = cellField;
    }

    public void changeCellinXY(int x, int y){
        if(cellField[x][y] == 0){
            cellField[x][y] = 1;
        } else{
            cellField[x][y] = 0;
        }
    }

    public void populateRandomly(){
        Random rnd = new Random();
        for(int i = 0; i < cellField[0].length*cellField.length; i++){
            if(rnd.nextInt(2) == 1){
                changeCellinXY(rnd.nextInt(cellField.length -1), rnd.nextInt(cellField[0].length-1));
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cellField.length; i++) {
            for (int j = 0; j < cellField[0].length; j++) {

                if (cellField[i][j] == 0) {
                    result += " . ";
                } else if( cellField[i][j] == 1) {
                    result += " * ";
                }
                if (j == cellField[0].length - 1) {
                    result += "\n";
                }
            }
        }
        return result;
    }

    public void nextGeneration() {
        int[][] cellPlayGround = new int[cellField.length][cellField[0].length];
        int[][] numberOfNeighboursArr = createNumberOfNeighboursArray();

        for(int i = 0; i < cellPlayGround.length; i++){
            for(int j = 0; j < cellPlayGround[0].length; j++){
                if(cellField[i][j] == 1) {
                    if (numberOfNeighboursArr[i][j] < 2) {
                        cellPlayGround[i][j] = 0;
                    }
                    else if(numberOfNeighboursArr[i][j] > 3) {
                        cellPlayGround[i][j] = 0;
                    }
                    else{
                        cellPlayGround[i][j] = 1;
                    }
                }else if(cellField[i][j] == 0 && numberOfNeighboursArr[i][j] == 3){
                    cellPlayGround[i][j] = 1;
                }
            }
        }
        this.cellField = cellPlayGround;
    }

    private int[][] createNumberOfNeighboursArray(){
        int [][] numberOfNeighboursArray = new int[cellField.length][cellField[0].length];
        for (int i = 0; i < numberOfNeighboursArray.length; i++) {
            for (int j = 0; j < numberOfNeighboursArray[0].length; j++) {
                numberOfNeighboursArray[i][j] = numberofNeighbours(i, j);
            }
        }

        return numberOfNeighboursArray;
    }

    private int numberofNeighbours(int x, int y){
        int numberofNeighbours = 0;
        int[][] neighbourArr = createNeighbourArr(x, y);

        for(int i = 0; i < neighbourArr.length; i++){
            for(int j = 0 ; j < neighbourArr[0].length; j++){
                if(neighbourArr[i][j] == 1){
                    numberofNeighbours++;
                }
            }
        }

        return numberofNeighbours;
    }

    private int[][] createNeighbourArr(int x, int y) {
        int[][] neighbourArr = new int[3][3];

        try{
            neighbourArr[0][0] = cellField[x-1][y-1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[0][0] = 0;
        }
        try{
            neighbourArr[0][1] = cellField[x-1][y];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[0][1] = 0;
        }

        try{
            neighbourArr[0][2] = cellField[x-1][y+1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[0][2] = 0;
        }


        try{
            neighbourArr[1][0] = cellField[x][y-1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[1][0] = 0;
        }

        neighbourArr[1][1] = 0;

        try{
            neighbourArr[1][2] = cellField[x][y+1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[1][2] = 0;
        }

        try{
            neighbourArr[2][0] = cellField[x+1][y-1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[2][0] = 0;
        }

        try{
            neighbourArr[2][1] = cellField[x+1][y];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[2][1] = 0;
        }

        try{
            neighbourArr[2][2] = cellField[x+1][y+1];
        }catch (ArrayIndexOutOfBoundsException e){
            neighbourArr[2][2] = 0;
        }

        return neighbourArr;

    }

    public int[][] getCellField() {
        return cellField;
    }

    public void setCellField(int[][] cellField) {
        this.cellField = cellField;
    }

}


