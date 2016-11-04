
public class Day5Ws21 {

    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial
        int a=7;
        int end=Fact2(a);
        System.out.println(end);
    }


    public static int Fact2(int n){
        int result;
        if(n==0 || n==1)
            return 1;

        result = Fact2(n-1) * n;
        return result;
    }
}

