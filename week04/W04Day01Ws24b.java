import java.util.*;

public class W04Day01Ws24b {
    public static void main(String... args) {
        String expression;
        System.out.println("Please type in the expression:");
        Scanner input = new Scanner(System.in);
        String operation = input.next();
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        if(operation.equals("+")){
            System.out.println(a+b);
        }
        if(operation.equals("-")){
            System.out.println(a-b);
        }
        if(operation.equals("*")){
            System.out.println(a*b);
        }
        if(operation.equals( "/")){
            System.out.println(a/b);
        }
        if(operation.equals("%")){
            System.out.println(a%b);
        }

    }
}
