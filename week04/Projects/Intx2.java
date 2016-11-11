
public class Intx2 {
    public static void main(String[] args) {
        double a = 0;
        double b = 3;
        int z =3;
        int w = 100000;
        double c=Intx2(a, b, z, w);
        System.out.println(c);
    }



    public static double Intx2(double a, double b, int z, int w){
        double d = (b-a)/w;
        double result = 0;
        for(int n=0; n<w; n++){
            result = result+(0.5*(Math.pow((a+n*d), z)+Math.pow((a+(n+1)*d), z)))*d;
        }
        return result;
    }
}
