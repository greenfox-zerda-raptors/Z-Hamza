/**
 * Created by Zoltán on 2016.11.15..
 */
public class Animal {
    private String type;
    int lifeExpectacy;
    boolean isCarnivore;
    public Animal(){
        System.out.println("Animal is created!");
        this.lifeExpectacy = 10;
        this.isCarnivore = false;
    }
    public Animal(Integer lifeExpectacy, Boolean isCarnivore){
        System.out.println("Animal is created!");
        this.lifeExpectacy=lifeExpectacy;
        this.isCarnivore=isCarnivore;
    }
    public Animal(String type){
        this();
        this.type = type;
        System.out.println(type + " is created!");
    }

    public void Sleep(){
        System.out.println("Animal is sleeping!");
    }

    public void Eat(){
        System.out.println("Animal is eating!");
    }
    public void Speak(){
        System.out.println("Shout");
    }
    public String toString(){
        System.out.println("isCarnivore=  "+isCarnivore + "     lifeExpectacy=   " +lifeExpectacy);
        return null;
    }

}
