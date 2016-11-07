import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class W04Day01Ws24 {
        public static void main(String... args){
            // Create a simple calculator application which does read the parameters from the prompt and prints the result to the prompt. It should support the following operations: +, -, *, /, % and it should support two operands. The format of the expressions must be: {operation} {operand} {operand}. Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
            // You can use the Scanner class
            // It should work like this:

            // Start the program
            // It prints: "Please type in the expression:"
            // Waits for the user input
            // Print the result to the prompt
            // Exit
            String expression;
            System.out.println("Please type in the expression:");
            Scanner input = new Scanner( System.in );
            expression=input.next();
            System.out.println("exp:    " +expression);


            StringBuilder sb= new StringBuilder();
            System.out.println(sb);
            System.out.println("Result:      ");
     if(expression.contains("+")){
         String aa = expression.substring(0, expression.lastIndexOf("+")+0);
         String bb = expression.substring(expression.lastIndexOf("+")+1);
         int a =Integer.parseInt(aa);
         int b =Integer.parseInt(bb);
               System.out.println(a+b);
        }
         if(expression.contains("-")){
             String aa = expression.substring(0, expression.lastIndexOf("-")+0);
             String bb = expression.substring(expression.lastIndexOf("-")+1);
             int a =Integer.parseInt(aa);
             int b =Integer.parseInt(bb);

              System.out.println(a-b);
          }
           if(expression.contains("*")){
               String aa = expression.substring(0, expression.lastIndexOf("*")+0);
               String bb = expression.substring(expression.lastIndexOf("*")+1);
               int a =Integer.parseInt(aa);
               int b =Integer.parseInt(bb);
               System.out.println(a*b);
          }




        }
}
