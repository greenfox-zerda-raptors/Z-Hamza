import java.util.*;

public class W04Day01Ws15{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7" ));
        // Add "a" to every string in al. Use a for(each) loop
        for(ListIterator<String> it=al.listIterator(); it.hasNext();){
            String i = it.next();
            it.set(i+"a");

        }
        System.out.println(al);
    }
}
