import java.util.*;
/**************************************************************************************************
 * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
 * special error message, namely "7's are cannibals!" printed.
 *
 *
 * So, I'm looking for the following output:
 * try - first statement
 * start - myMethod
 * An Exception Occurred
 * 7's are cannibals
 * Finally I did this instead
 * ::::FINISH LINE:::: out of the try/catch/finally statement
 *
 * Refer to Workshop07
 **************************************************************************************************/
public class W04Day03Ws09 {

    static int myMethod(int inNumber) throws Exception {
        if (inNumber == 7) {
            throw new Exception("7's are cannibals");
        }
        return 100 / (7 - inNumber);
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Seven is bad and you should feel bad";
        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    System.out.println("First");
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





