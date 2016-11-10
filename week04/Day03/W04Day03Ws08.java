/**************************************************************************************************
 * Workshop: Practice Exceptions: Having raised exceptions, then what?  I'm looking to get some
 * closure here.  "Finally" would do... whatever else, this is what I need if something goes
 * wrong...
 *
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 **************************************************************************************************/
import java.util.*;
public class W04Day03Ws08 {


    static int myMethod(int inNumber) throws Exception {
        if (inNumber == 7) {
            throw new Exception("ef jú cí kéj");
        }
        return 100 / (7 - inNumber);
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Seven is bad and you should feel bad?";
        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod(age);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    System.out.println("Finally");
                }
            }


            System.out.println("::::FINISH LINE::::");
        }

    }
}