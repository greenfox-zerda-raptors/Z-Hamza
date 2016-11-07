import java.util.*;

public class W04Day01Ws16{
    public static void main(String... args){
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 ));
        // Fix this code fragment! It should remove every even number from the list.

        for(Iterator<Integer> it = al.iterator(); it.hasNext();){
            int i = it.next();
            if(i % 2 == 0){
                it.remove();
            }
        }
        System.out.println(al);
    }
}