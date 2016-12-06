/**
 * Created by Zoltán on 2016.12.06..
 */
public class Accumul {
    public static String accum(String expression){
        String result = "";
        String dummyString = expression.toLowerCase();


        for(int i = 0; i<dummyString.length(); i++){
            char letter = dummyString.charAt(i);
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    char firstLetter = Character.toUpperCase(letter);
                    result += firstLetter;
                }
                else {
                    result += letter;
                }
                if(j == i && i != dummyString.length()-1){
                    result += "-";
                }

            }
        }
        return result;

    }
}
