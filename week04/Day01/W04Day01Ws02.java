import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W04Day01Ws02 {
    public static void main(String... args){
        String[] numbers = new String[] { "one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        List<String> myList = new ArrayList<String>(Arrays.asList(numbers));
        System.out.println(myList);
    }

}
