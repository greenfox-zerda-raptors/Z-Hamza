import java.util.*;

public class W04Day01Ws13{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator
        for (Iterator<String> list1 = list.iterator(); list1.hasNext();){
            System.out.println(list1.next());
        }
    }
}
