import java.util.*;

/**
 * Created by Zoltán on 2016.11.10..
 */
public class W04Day04Ws02 {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Wanna play a game?\n"+"Can you guess which number I thought from 1 to 100?\n"+"Type 0 to exit");

        Random thing = new Random();
        int input = -1;
        int number = thing.nextInt(100);
        System.out.println("The number I thought is: "+number); //  added for testing!!!
        int chances = 6;
        ArrayList<Integer> trials = new ArrayList<Integer>();
        try {
            while (input != 0 && trials.size() < chances) {
                input = userInput.nextInt();
                if (input > 100) {
                    trials.add(input);
                    if (input == 0) {
                        System.out.println("Bye!");
                        break;
                    }
                    if (number > input && trials.size() != 7) {
                        System.out.println("Higher!" + "  Only " + (chances - trials.size()) + " to go");
                    }
                    if (number < input && trials.size() != 7) {
                        System.out.println("Lower!" + "  Only " + (chances - trials.size()) + " to go");
                    }
                    if (number == input) {
                        System.out.println("Correct, you won!" + "  You guessed it in " + trials.size() + " steps!!!");
                    }
                    if (trials.size() == 7 && number != input) {
                        System.out.println("Oh no!!!");
                    }
                }

            }
        }catch(InputMismatchException e){
            System.out.println("That's not a number you twat!");
        }




    }
}
