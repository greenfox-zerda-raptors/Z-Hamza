package main.java;

public class ElectricBassGuitar extends StringedInstrument{

    public ElectricBassGuitar(){
        super(4, "Duum-duum-duum");
    }

    public ElectricBassGuitar(int numberOfStrings){
        super(numberOfStrings, "Duum-duum-duum");
    }
    public void play(){
        System.out.printf(formatForPlay, "Bass Guitar", numberOfStrings, sound);
    }
}
