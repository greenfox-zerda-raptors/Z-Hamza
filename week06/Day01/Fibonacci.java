package Week06;

import java.util.ArrayList;

public class Fibonacci {
    public static int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else

            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public Integer[] listFibonacci(int limit) {
    Integer[] result = new Integer[limit+1];
        for (int counter = 0; counter <= limit; counter++){
            result[counter]= fibonacci(counter);
        }
    return result;
    }

}
