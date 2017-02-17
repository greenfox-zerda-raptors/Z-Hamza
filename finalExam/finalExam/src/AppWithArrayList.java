import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zoltán on 2017.02.17..
 */


// Create a function that takes a matrix (list of lists) of numbers and sums all the numbers.

public class AppWithArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        testList.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));
        testList.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));
        testList.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));
        testList.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));
        testList.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));

        System.out.println(sumNumbersInMatrix(testList));

    }

    private static int sumNumbersInMatrix(ArrayList<ArrayList<Integer>> ListOfListOfNumbers){
        int result = 0;
        for (ArrayList<Integer> innerList : ListOfListOfNumbers) {
            for (Integer innerListElement : innerList) {
                result += innerListElement;
            }
        }
        return result;
    }
}
