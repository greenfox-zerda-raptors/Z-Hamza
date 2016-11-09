import java.util.*;
public class W04Day01Ws05 {
   public static void main(String... args){
       ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array
       Integer[] bar = numList.toArray(new Integer[numList.size()]);
        System.out.println(numList);
    }
}

