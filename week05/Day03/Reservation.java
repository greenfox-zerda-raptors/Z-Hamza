package com.greenfox;

public class Reservation implements Reservationy{

    public String codeBooking;
    public String DoWBooking;



    public Reservation(){

    }
    public Reservation(String DoWBooking){
        this.DoWBooking=DoWBooking;
        this.codeBooking=randomZeroToZ(8);
    }

    public void setDowBooking(String dowBooking){
        this.DoWBooking=dowBooking;
    }

    public String getDowBooking(){
        return DoWBooking;
    }

    public void setCodeBooking(String codeBooking){
        this.codeBooking=codeBooking;
        this.codeBooking = randomZeroToZ(8);
    }

    public String getCodeBooking(){
        return codeBooking;
    }

    public boolean PlaceReserved(String dowBooking, String codeBooking){
        return true;
    } //must return true if successful

    public boolean PlaceCancelled(String dowBooking, String codeBooking){
        return true;
    }//must return true if successful

    public String toString(){
        String a = new String("Booking# " + codeBooking + " for " + DoWBooking);
        return a;
    } //format("Booking# %s for %s");

    final static String[] lsDow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    public String randomDow(int ct) {
        return lsDow[(int) (Math.random() * 6)];
    }

    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;

    }


}
