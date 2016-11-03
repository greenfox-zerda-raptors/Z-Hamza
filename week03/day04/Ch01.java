
public class Ch01 {
    public static void main(String[] args) {
        int x=0;
        int number=0;
        int n=100;
        String Primes="";
        for(x=1; x<=n; x++)
        {
            int c=0;
            for(number =x; number>=1; number--)
            {
                if (x % number == 0) {

                    c = c + 1;
                }
            }
            if(c==2)
            {
            Primes=Primes+x+" ";
            }
        }
        System.out.println(Primes);



    }
}
