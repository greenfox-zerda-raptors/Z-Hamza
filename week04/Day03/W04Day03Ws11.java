import java.util.*;

/**************************************************************************************************
 * Workshop: Practice Exceptions: Throw multiple exceptions
 *
 * Go back to the Workshop07 (7 ate 9) and extend it to also throw an exception for 9 (it's no longer
 * useful as a number, it's just a "pile of bones")
 *
 * see the example at http://beginnersbook.com/2013/12/throws-keyword-example-in-java/
 * to see how one can create multiple throws
 *
 * INPUT? 7
 * Exception: 7's are cannibals
 * INPUT? 9
 * Exception: Nothing but bones
 **************************************************************************************************/
public class W04Day03Ws11 {

    public static int myMethod1(int testnum) throws Exception // something should appear here before
    {
        if (testnum == 7){
            throw new Exception("The number cannot be 7!");
        }
        return 100/(testnum-7);
    }
    public static int myMethod2(int testnum) throws Exception // something should appear here before
    {
        if (testnum == 9){
            throw new Exception("The number cannot be 9!");
        }
        return 100/(testnum-9);
    }
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Enter any number, 0 to exit?";

        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod1(age);
                    myMethod2(age);
                    System.out.println("try - last statement");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } //while
        } // main
    }
}
