import java.util.ArrayList;
import java.util.Arrays;
public class W04Day01Ws03 {
    public static void main(String... args){
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("first", "second", "fourth"));
        // The "third" element is missing from the arrayList. Insert it into the arrayList between second and fourth
        arrayList.add(2,"third");
        System.out.println(arrayList);
    }
}
