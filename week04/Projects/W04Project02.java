import java.util.*;
public class W04Project02 {
    static Scanner userInput = new Scanner(System.in);
    private static ArrayList<Integer> Primes(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int x;
        int number;
        for (x = 1; x <= n; x++) {
            int c = 0;
            for (number = x; number >= 1; number--) {
                if (x % number == 0) {
                    c = c + 1;
                }
            }
            if (c == 2) {
                result.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hi! \n" + "Please type in a number");
        try {
            while (userInput.hasNext()) {
                int factorizable = userInput.nextInt();
                if (factorizable == 0) {
                    System.out.println("Bye!");
                    break;
                }
                else {
                    long startTime = System.currentTimeMillis();
                    ArrayList<Integer> primes = Primes(factorizable);
                    if (primes.contains(factorizable)) {
                        System.out.println("It's a prime number");
                    }
                    else {

                        ArrayList<Integer> divide = new ArrayList<Integer>();
                        for (int i = 0; i < primes.size(); i++) {
                            if (factorizable % primes.get(i) == 0) {
                                divide.add(primes.get(i));
                            }
                        }
                        ArrayList<Integer> osztok = new ArrayList<Integer>();
                        for (int i = 0; i < divide.size(); i++) {
                            int c = 0;
                            while (factorizable % divide.get(i) == 0) {
                                factorizable = factorizable / divide.get(i);
                                c = c + 1;
                            }
                            osztok.add(c);
                        }
                        for (int j = 0; j < divide.size(); j++) {
                            if (osztok.get(j) == 1) {
                                System.out.println(divide.get(j) + "   " + " once");
                            }
                            if (osztok.get(j) == 2) {
                                System.out.println(divide.get(j) + "   " + " twice");
                            }
                            if (osztok.get(j) != 1 && osztok.get(j) != 2) {
                                System.out.println(divide.get(j) + "    " + osztok.get(j) + " times");
                            }
                        }
                        long estimatedTime = System.currentTimeMillis() - startTime;
                        System.out.println("Time: "+estimatedTime +" ms");
                    }
                }

                System.out.println("Type in a new number or 0 to exit");

            }
        }
        catch(InputMismatchException e1){
            System.out.println("That's not a number");
        }
    }




}