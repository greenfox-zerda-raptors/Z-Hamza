import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class W04Day03Ws02{
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};
        function1(numbers);
    }
    public static void function1( String[] numbers) {
        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.print(i);
                System.out.print("=" + numbers[i] + "\n");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }

        System.out.println("::::FINISH LINE::::");
    }
}