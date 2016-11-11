import java.util.*;
public class W04Project03_b {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
//        String[] input0 = userInput.nextLine().split(" ");
//        String[] input1 = userInput.nextLine().split(" ");
//        String[] input2 = userInput.nextLine().split(" ");
//        String[] input3 = userInput.nextLine().split(" ");
//        String[][] inputmatrix = new String[4][];
//        inputmatrix[0] = input0;
//        inputmatrix[1] = input1;
//        inputmatrix[2] = input2;
//        inputmatrix[3] = input3;

     int[][] inputmatrix = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44},{51, 52, 53, 54}};
        int row = inputmatrix.length;
        int col = inputmatrix[1].length;
//        int[][] m = new int[c][r];
        int[][] matrix2 = new int[col][row];
//        int[][] matrix3 = new int[r][c];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(inputmatrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j <row; j++) {
                matrix2[i][j] = inputmatrix[4 - j][i];
            }
        }
        System.out.println("");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
