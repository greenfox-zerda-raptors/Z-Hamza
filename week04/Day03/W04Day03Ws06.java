/**************************************************************************************************
 * Workshop: Practice Exceptions: Nested Try Catch - 2nd situation
 *
 * Run this and explain the what is going on
 *
 *
 *    ---  The program creates an array of integers built up form 4 numbers. Then in the try-block 3
 *    it tries to print the 10th element of the array. The catch in the 42nd line, which is the parent element's
 *    catch, is an "Outofboundaries" exception, which tells the program to print those two outputs in the 45th and 46th line.
 **************************************************************************************************/



import java.util.*;

public class W04Day03Ws06 {
    public static void main(String[] args){
        //main try-block
        try{
            //try-block2
            try{
                //try-block3
                try{
                    int arr[]= {1,2,3,4};
            	/* I'm trying to display the value of
            	 * an element which doesn't exist. The
            	 * code should throw an exception
            	 */
                    System.out.println(arr[10]);
                }catch(ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            }
            catch(ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        }
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        }
        catch(Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
