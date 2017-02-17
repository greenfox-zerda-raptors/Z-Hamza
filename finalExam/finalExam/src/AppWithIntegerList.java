/**
 * Created by Zoltán on 2017.02.17..
 */

// Create a function that takes a matrix (list of lists) of numbers and sums all the numbers.

public class AppWithIntegerList {

    public static void main(String[] args) {
        int[][] testMatrix = new int[][]{
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7}
        };
        System.out.println(sumOfAMatrix(testMatrix));
    }

    private static int sumOfAMatrix(int[][] matrix){
        int result = 0;
        for(int k = 0; k < matrix.length; k++){
            for (int l = 0; l < matrix[k].length; l++){
                result += matrix[k][l];
            }
        }

        return result;
    }
}
