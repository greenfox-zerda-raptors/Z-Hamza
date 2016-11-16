package com.greenfox;

public class CreditCard implements CreditCardy{
    public int SumCVV;
    public String NameCardholder;
    public String CodeAccount;


    public CreditCard(){

    }
    public CreditCard(int SumCVV, String NameCardholder, String c){
        this.SumCVV=SumCVV;
        this.NameCardholder=NameCardholder;
        this.CodeAccount=c;
    }



    public void setSumCVV(int sumCVV) {
        this.SumCVV=sumCVV;
    }

    public int getSumCVV() {
        return SumCVV;
    }

    public void setNameCardholder(String nameCardholder) {
    this.NameCardholder=nameCardholder;
    }

    public String getNameCardholder() {
        return NameCardholder;
    }

    public void setCodeAccount(String codeAccount) {
        this.CodeAccount=codeAccount;
    }

    public String getCodeAccount() {
        return CodeAccount;
    }

    public int cumeSumCVV(String codeAccount) {
        int out =0;
        for(int i=0; i<16; i++){
            out = out + Integer.parseInt(String.valueOf(CodeAccount.charAt(i)));
        }
        return out;
    }

    public boolean ValidCard(String codeAccount, int sumCVV) {
        return false;
    }

    public String toString() {
        return "Name = " +NameCardholder+ "  CC#=   "+ CodeAccount +"    CVV=  "+cumeSumCVV(CodeAccount);
    }

}
