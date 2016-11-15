
public class Shiptest {
    public static void main(String[] args) {
        Ship sajt = new Ship();
        sajt.RandomCrew();
        sajt.RandomCaptain();

        for(int i =0;i<sajt.crewSize(); i++){
            System.out.println(sajt.getCrew(i));
        }
    }
}
