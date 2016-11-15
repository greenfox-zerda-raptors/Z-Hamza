/**
 * Created by Zoltán on 2016.11.15..
 */
public class Dog extends Animal{
    public Dog(){
        super("Dog");
        super.isCarnivore=true;
        super.lifeExpectacy=15;
    }
    @Override
    public void Speak(){
        System.out.println("Barks");
    }
    public void Beg(){
        System.out.println("Begs");
    }
    public void hasTail(){
       boolean hasTail = true;
        System.out.println("Has tail=" + hasTail);
    }
}
