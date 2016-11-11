
public class Ch01 {
    public static void main(String[] args) {
        int x=0;
        int number=0;
        int n=100000;
//        String Primes="";
        long startTime = System.currentTimeMillis();

        for(x=1 ; x<=n ; x++)
        {
            int c=0;
            for(number = 1 ; number < x ; number++)
            {
                if (x % number == 0) {
                    c = c + 1;
                }
            }
            if(c==1)
            {
//             If it is needed in a string or in one line delete the comments
//             Primes=Primes+x+" ";
               System.out.println(x);
            }
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: "+estimatedTime +" ms");



//        java.util.Date date2 = new java.util.Date();


//        System.out.println(date1);
//        System.out.println(date2);



//        System.out.println(Primes);



    }
}
