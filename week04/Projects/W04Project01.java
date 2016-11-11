import java.util.*;

/**
 * Created by Zoltán on 2016.11.10..
 */
public class W04Project01 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi there! I wanna play a game!\n" + "Try to guess the number I thought!\n" + "Type in the range, or type 0 to exit");
        Random thing = new Random();
        int chances = 6;
        int input = -1;
        ArrayList<Integer> trials = new ArrayList<>();
        try {
            int number = thing.nextInt(input = userInput.nextInt());
            System.out.println("Alright, I got it. It's your turn now");
            System.out.println("The number I thought is: " + number); //  added for testing!!!
            while (input != 0) {
                if (input == 0 | trials.size() == chances + 1) {
                    break;
                }
                try {
                    while (input != 0 && trials.size() < chances + 1) {
                        input = userInput.nextInt();
                        trials.add(input);
                        if (input == 0) {
                            break;
                        }
                        if (number > input && trials.size() != chances + 1) {
                            System.out.println("Higher!" + "  You have only " + (chances + 1 - trials.size()) + " guesses left!");
                        }
                        if (number < input && trials.size() != chances + 1) {
                            System.out.println("Lower!" + "  You have only " + (chances + 1 - trials.size()) + " guesses left!");
                        }
                        if (number == input) {
                            System.out.println("Correct, you won!" + "  You guessed it in " + trials.size() + " tries!!!");
                        }
                        if (trials.size() == chances + 1 && number != input) {
                            System.out.println("Oh no!!!");
                            System.out.println("The number I thought is: " + number);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("That's not a number you twat!");
                }
//                System.out.println("Bye!");
            }

        } catch (IllegalArgumentException e1) {
            System.out.println("Ok, bye!");
        } catch (InputMismatchException e) {
            System.out.println("That's not a number you twat!");

        }
    }
}