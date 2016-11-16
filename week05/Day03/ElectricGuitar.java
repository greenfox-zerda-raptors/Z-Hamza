package main.java;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(){
        super(6, "twangs");
    }

    public ElectricGuitar(Integer Stringnumber){
        super(Stringnumber, "twangs");
    }
    public void play(){
        System.out.printf(formatForPlay, "Electric Guitar", numberOfStrings, sound);
    }
}
