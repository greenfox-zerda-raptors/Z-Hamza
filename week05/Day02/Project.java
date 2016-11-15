import java.util.*;

/**
 * Created by Zoltán on 2016.11.15..
 */
public class Project {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> dermulti = new ArrayList<Integer>();
        ArrayList<Integer> derexp = new ArrayList<Integer>();
        ArrayList<Integer> intmulti = new ArrayList<Integer>();
        ArrayList<Integer> intexp = new ArrayList<Integer>();
        System.out.print("Type in the expression in:         (Format: a x b)\n");
        while (userInput.hasNext()) {
        if(userInput.next().equals("Der")){
                int a = userInput.nextInt();
                dermulti.add(a);
                userInput.next();
                int b = userInput.nextInt();
                derexp.add(b);

                System.out.println(a * b + "x" + "^" + (b - 1));

            }
            if(userInput.next().contains("IdInt")){
                int a = userInput.nextInt();
                intmulti.add(a);
                userInput.next();
                int b = userInput.nextInt();
                intexp.add(b);
                if( a % ( b+1 ) == 0){
                    int f = a/(b+1);
                    System.out.println(f + ")" + "x" + "^" + (b + 1) +" + C");
                }
                else if((b+1)%a == 0){
                    int f = (b+1)/a;
                    System.out.println("("+"1"+"/"+ f + ")" + "x" + "^" + (b+1) + " + C");
                }
                else{
                    System.out.println("(" + a + "/" + (b + 1) + ")" + "x" + "^" + (b + 1) +" + C");
                }
            }
            if(userInput.next().contains("DInt")){
                int c = userInput.nextInt();
                intmulti.add(c);
                userInput.next();
                int n = userInput.nextInt();
                intexp.add(n);
                double nn = (double) n;
                double a = userInput.nextInt();
                double b = userInput.nextInt();
                double result = (c/(nn+1) * (Math.pow(b, nn+1)) - (c/(nn+1) * (Math.pow(a, nn+1))));
                System.out.println(result);
            }
        }
        }
//            if(userInput.next().equals("+")){
//                int c = userInput.nextInt();
//                multi.add(c);
//                userInput.next();
//                int d = userInput.nextInt();
//                exp.add(d);
//                System.out.print(" + " + c*d + "x" + "^" + (d-1));
//            }
//
//            if(userInput.next().equals("-")) {
//                int c = userInput.nextInt();
//                multi.add(c);
//                userInput.next();
//                int d = userInput.nextInt();
//                exp.add(d);
//                System.out.print(" - " + c * d + "x" + "^" + (d - 1));
//            }
            }
