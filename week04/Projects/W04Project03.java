import  java.util.*;
public class W04Project03 {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int[][] m = new int[c][r];
        int[][] matrix2 = new int[r][c];
        int[][] matrix3 = new int[r][c];
        int[][] inputmatrix = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};
        System.out.println(Arrays.deepToString(inputmatrix));
//        for(int i=0; i<r; i++ ) {
//            for (int j = 0; j < c; i++){
//                m[j][i] = inputmatrix[3 - i][j];
//            }
//        }
        m[0][0] = inputmatrix[3][0];
        m[0][1] = inputmatrix[2][0];
        m[0][2] = inputmatrix[1][0];
        m[0][3] = inputmatrix[0][0];

        m[1][0] = inputmatrix[3][1];
        m[1][1] = inputmatrix[2][1];
        m[1][2] = inputmatrix[1][1];
        m[1][3] = inputmatrix[0][1];
        System.out.println(Arrays.deepToString(m));
        System.out.println(Arrays.deepToString(matrix3));
        for (int i = 0; i < inputmatrix.length; i++) {
            for (int j = 0; j < inputmatrix[i].length; j++) {
                System.out.print(inputmatrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix2[i][j] = inputmatrix[3 - j][i];
            }
        }
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix3));
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix3[i][j] = matrix2[3 - j][i];

            }

        }
        System.out.println(Arrays.deepToString(matrix3));
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}