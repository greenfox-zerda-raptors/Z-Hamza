import java.util.*;

public class W04Day01Ws14{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        System.out.println(al);
        ListIterator<String> it= al.listIterator();

        while(it.hasNext()){
            it.set(it.next()+"a");
        }
        System.out.println(al);
    }
}