/**
 * Created by Zoltán on 2016.11.15..
 */
public class Bird extends Animal {

    public Bird(){
        super("Bird");
        super.isCarnivore= false;
        super.lifeExpectacy=2;

    }

    public void Fly(){
        System.out.println("Bird can fly!");
    }
    public void Sleep(){
        super.Sleep();
        System.out.println("Bird is sleeping!");
    }

    public void Eat(){
        System.out.println("Bird is eating!");
    }
    public void NightNight(){
        super.Eat();
        Sleep();
    }
    public void Speak(){
        System.out.println("Chirp");
    }

}
