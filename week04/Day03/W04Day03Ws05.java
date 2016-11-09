import java.util.*;
/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch
 *
 * Run this and explain the what the heck is going on
 *
 * ADD YOUR EXPLANATION HERE ---    The program runs. It enters the parent try and then the child try block1, where it executes
 *                                   the 18th line. Then it reaches the mathematical expression where its catch says to skip it and executes
 *                                   the 24th line. Then it enters the child try block 2, where it executes the 28th line, and tries to
 *                                   solve the mathematical expression, where the parent try elemnt's catch stops it an executes the 39th and
 *                                   the 40th line. The remaining "catch"es are irrelevant since the e4 is an "outofboundaires" exception which
 *                                   is not the case here, and the e5 is a general exception which get "overwritten" by the e3, which is an
 *                                   ArithmeticException which is the case here.
 *
 *
 **************************************************************************************************/
public class W04Day03Ws05 {
        public static void main(String[] args){

            //Parent try block
            try{
                //Child try block1
                try{
                    System.out.println("Inside block1");
                    int b =45/0;
                    System.out.println(b);
                }
                catch(ArithmeticException e1){
                    System.out.println("Exception: e1");
                }
                //Child try block2
                try{
                    System.out.println("Inside block2");
                    int b =45/0;
                    System.out.println(b);
                }
                catch(ArrayIndexOutOfBoundsException e2){
                    System.out.println("Exception: e2");
                }
                System.out.println("Just other statement");
            }
            catch(ArithmeticException e3){
                System.out.println("Arithmetic Exception");
                System.out.println("Inside parent try catch block");
            }
            catch(ArrayIndexOutOfBoundsException e4){
                System.out.println("ArrayIndexOutOfBoundsException");
                System.out.println("Inside parent try catch block");
            }
            catch(Exception e5){
                System.out.println("Exception");
                System.out.println("Inside parent try catch block");
            }
            System.out.println("Next statement..");
        }
    }

