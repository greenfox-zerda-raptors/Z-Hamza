
public class Day5Ws18 {
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter
       int n=100;
        int sajt = SUM(n);
        System.out.println(sajt);



    }
    public static int SUM(int n){
        int result=0;
        for(int i=1; i<=n; i++)
            result=result+i;


        return result;
    }






}
