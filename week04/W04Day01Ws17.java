import java.util.*;

public class W04Day01Ws17{

    // Implement trimAll(..)
    // Expected output:
    // "first"
    // "second"
    // "third"
    // "fourth"
    // "fifth"

    static void trimAll(List<String> strings) {
      for(ListIterator<String> it=strings.listIterator(); it.hasNext();){
          String trimming=it.next();
          String trimmed=trimming.trim();
          it.set(trimmed);
      }
    }

    public static void main(String... args){
        List<String> strList = new ArrayList<String>(Arrays.asList("   first", "second   ", "  third ", "fourth", "    fifth "));
        trimAll(strList);
        for (String str : strList) {
            System.out.format("\"%s\"%n", str);
        }
    }
}
