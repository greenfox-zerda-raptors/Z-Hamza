import javax.swing.plaf.basic.BasicSliderUI;
import java.text.DecimalFormat;

public class problem02 {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;
        System.out.println("a+10=" + a);
        int b = 100;
        b = b - 7;
        System.out.println("b-7=" + b);
        int c = 44;
        c = 2 * c;
        System.out.println("2c=" + c);
        int d = 125;
        d = d / 5;
        System.out.println("d/5=" + d);
        double e = 8;
        e = Math.pow(e, 2);
        System.out.println("e^2=" + e);
        double f = 16;
        f = Math.sqrt(f);
        System.out.println("f^.5=" + f);

        int g1 = 123;
        int g2 = 345;
        Boolean trueCondition = Boolean.TRUE;
        boolean trueBool = true;
        boolean falseBool = false;
        System.out.println(g1 > g2);

        int h1 = 350;
        int h2 = 200;
        System.out.println(2 * h1 > 2 * h2);

        long i = 1357988018575474L;
        if ((i % 11) == 0) {
            System.out.println("yes");
        }
        if ((i % 11) != 0) {
            System.out.println("no");
        }
        int j1 = 10;
        int j2 = 3;
        if ((j1) >= Math.pow(j2, 2) && j1 <= Math.pow(j2, 3))
            System.out.println("In between");
        else
            System.out.println("Not between");

        int k=1521;
        if ((k % 3) == 0){
            System.out.println(k+" dividable by 3");
        }
        else
            System.out.println(k+" not dividable by 3");

        if ((k % 5) == 0){
            System.out.println(k+" dividable by 5");
        }
        else
            System.out.println(k+" not dividable by 5");

        double l1=2;
        double l2=3;
        double ll= l1 / l2;
        DecimalFormat df= new DecimalFormat("#.0000000");
        String llformated=df.format(ll);
        System.out.println(llformated);

        int r=3;
        double Area=Math.PI * Math.pow(r,2);
        DecimalFormat df1= new DecimalFormat("#.00");
        String Areaformated=df1.format(Area);
        System.out.println(Area);
        System.out.println(Areaformated);


        String qrva = "java is awesome";
        System.out.println(qrva.charAt(1));


        String m="apple";


        String n = "The result is: ";
        int aa=2;
        int bb=3;
        System.out.println(n + aa*bb);


        String o = "pneumonoultramicroscopicsilicovolcanoconiosis";
        int mylength=o.length();
        System.out.println(mylength);

        String proverb = "Hope for the best, but prepare for the worst.";
        System.out.println(proverb.lastIndexOf('p'));
        System.out.println(proverb.contains("worst"));

        String quote="We're here at GreenFox's office and I'm a member of the \"Raptors\" team.";
        System.out.println(quote);

        String proverb2 = "If it ain't broke, don't fix it.";
        

    }
}
