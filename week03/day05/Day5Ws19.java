
public class Day5Ws19 {
    public static void main(String[] args) {
        // create a function that returns it's input factorial
        long n=10;
        long end=Factorial(n);
        System.out.println(end);
    }
    public static  long Factorial(long n){
        long result=1;
        for(int i=1; i<=n; i++)
            result=result*i;
        return result;

    }


}
