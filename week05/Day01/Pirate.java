import java.util.*;

public class Pirate {
    private static int counter1 = 0;
    private String name;
    ArrayList<String> pirates = new ArrayList<String>();
    public Pirate(){

    }
    public void drinkSomeRum(){
        counter1 ++;
    }
    public String howItGoingMate(){
        if(counter1 <= 4) {
            return "Pour me anudder!";
        }
        else{
            return  "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }
    public void addPirates(String name){
        pirates.add(name);
    }
    public Integer size(){
        return pirates.size();
    }
    public String get(int i){
        return pirates.get(i);
    }
    public void brawl(){
        Random rnd = new Random();
        int a = rnd.nextInt(pirates.size()-1);
        System.out.println("The winner is " + pirates.get(a));
    }
}
