/**
 * Created by Zoltán on 2016.12.06..
 */
public class NumberConverter {


    public static String arabicToRoman(int i) {
        String result = "";

        int factor = i;

        int[] limits = new int[]{1000, 900, 500, 400,100, 90, 50,40,10,9,5,4,1};
        String[] romanNumberLimits = new String[]{"M", "CM","D", "CD","C", "XC","L","XL","X", "IX", "V", "IV","I"};
//         - - - - - loop - - - - - -
        for(int k = 0; k < limits.length; k ++){
            while(factor >= limits[k]){
                result += romanNumberLimits[k];
                factor -= limits[k];
            }
        }
        return result;

    }
}
