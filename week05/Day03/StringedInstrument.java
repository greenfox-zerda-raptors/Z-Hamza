package main.java;

abstract public class StringedInstrument extends Instrument {
    public int numberOfStrings;
    public String sound;
    public StringedInstrument(){

    }
    public StringedInstrument(int numberOfStrings, String sound){
        this.numberOfStrings=numberOfStrings;
        this.sound=sound;
    }
    final String formatForPlay ="%s, a %d-stringed instrument that %s\n";


}

