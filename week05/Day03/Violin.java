package main.java;

public class Violin extends StringedInstrument {

    public Violin(){
        super(4, "screeches");
    }

    public Violin(int numberOfStrings){
        super(numberOfStrings, "screeches");
    }
    public void play(){
        System.out.printf(formatForPlay, "Violin", numberOfStrings, sound);
    }
}
