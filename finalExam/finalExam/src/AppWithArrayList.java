import java.util.ArrayList;

/**
 * Created by Zoltán on 2017.02.17..
 */


// Create a function that takes a matrix (list of lists) of numbers and sums all the numbers.

public class AppWithArrayList {

    public static void main(String[] args) {

    }

    public int sumNumbersInMatrix(ArrayList<ArrayList<Integer>> inTakeList){
        int result = 0;
        for(int i = 0; i < inTakeList.size(); i++){
            ArrayList<Integer> currentList = inTakeList.get(i);
            for(int j = 0; j < currentList.size(); j++){
                int number = currentList.get(i);
                result += number;
            }
        }

        return result;
    }
}
