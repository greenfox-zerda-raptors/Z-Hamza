
public class WordToolbox implements IWordToolbox{
    private String stringHeld;

    public WordToolbox() {
    }


    public WordToolbox(String stringHeld){
        this.stringHeld=stringHeld;
    }

    public String getStringHeld() {
        return stringHeld;
    }

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public int countHowMany(char charToFind){
        int counter = 0;
        for(int i = 0; i < stringHeld.length(); i++){
            if(charToFind == stringHeld.toLowerCase().charAt(i)){
                counter ++;
            }
        }
        return counter;
    }
    public int countHowManyUpperCase(char charTofind){
        int counter = 0;
        for(int i = 0; i <stringHeld.length(); i++){
            if(charTofind == stringHeld.charAt(i)) {
                counter++;
            }
        }
        return counter ++;
    }


    @Override
    public void setS(String s) {

    }

    @Override
    public String getS() {
       return stringHeld;
    }

    @Override
    public boolean isAnAnagram(String stringToCheck) throws Exception {
        return false;
    }

    @Override
    public void WaitingItOut() {
    }
}
