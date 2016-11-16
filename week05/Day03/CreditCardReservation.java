package com.greenfox;
public class CreditCardReservation implements CreditCardy, Reservationy{
    Reservation reservation;
    CreditCard creditcard;


    public CreditCardReservation() {
    }
    public CreditCardReservation(String DoW, int SumCVV, String NameCardholder, String CodeAccount){
        this.reservation = new Reservation(DoW);
        this.creditcard = new CreditCard(SumCVV, NameCardholder, CodeAccount);
    }

    public void setSumCVV(int sumCVV) {
        this.creditcard.setSumCVV(sumCVV);
    }

    public void setDowBooking(String dowBooking) {
        this.reservation.setDowBooking(dowBooking);
    }
    public int getSumCVV() {
        return creditcard.getSumCVV();
    }

    public String getDowBooking() {
        return reservation.getDowBooking();
    }

    public void setNameCardholder(String nameCardholder) {
        this.creditcard.setNameCardholder(nameCardholder);
    }

    public void setCodeBooking(String codeBooking) {
        this.reservation.setCodeBooking(codeBooking);
    }

    public String getNameCardholder() {
        return creditcard.getNameCardholder();
    }

    public String getCodeBooking() {
        return reservation.getCodeBooking();
    }

    public void setCodeAccount(String codeAccount) {
        this.creditcard.setCodeAccount(codeAccount);
    }

    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return false;
    }

    public String getCodeAccount() {
        return null;
    }

    public int cumeSumCVV(String codeAccount) {
        return creditcard.cumeSumCVV(codeAccount);
    }

    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return false;
    }

    public boolean ValidCard(String codeAccount, int sumCVV) {
        return false;
    }


    public String randomDow(int a) {
        return null;
    }

    public String toString() {
        return "Booking# " + reservation.getCodeBooking()+ " for "  + reservation.getDowBooking()+
                " paid by Name=" +creditcard.getNameCardholder() +"   CC#=" + creditcard.getCodeAccount() + "  CVV= "
                + cumeSumCVV(creditcard.getCodeAccount());
    }
}
