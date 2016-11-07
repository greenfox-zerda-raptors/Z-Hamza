
import java.util.*;

public class W04Day01Ws08{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        if(arrayList.contains(7)) {
            System.out.println("Hooray");
        }
            else{
                System.out.println("Nooooo");
            }

        }

}