/**
 * Created by Zoltán on 2016.11.21..
 */
public class App {
    public static void main(String[] args) {

        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        System.out.println ("countHowMany(\"a\")=" + wSource.countHowMany('a'));
        System.out.println ("countHowMany(\"T\")=" + wSource.countHowMany('T'));
        System.out.println ("countHowMany(\"t\")=" + wSource.countHowMany('t'));
        System.out.println ("countHowMany(\"x\")=" + wSource.countHowMany('x'));
        System.out.println ("countHowMany(\" \")=" + wSource.countHowMany(' '));
    }
}
