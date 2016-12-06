/**
 * Created by Zoltán on 2016.12.06..
 */
public class NumberConverter {


    public static String arabicToRoman(int i) {
        String romanOne = "I";
        String romanFive = "V";
        String romanTen = "X";
        String romanFifthy = "L";
        String result = "";

        int factor = i;

        int[] limits = new int[]{1000, 900, 500, 400,100, 90, 50,40,10,9,5,4,1};
        String[] romanNumberLimits = new String[]{"M", "CM","D", "CD","C", "XC","L","XL","X", "IX", "V", "IV","I"};
//         - - - - - loop - - - - - -
        for(int k = 0; k < limits.length; k ++){
            while(factor >= limits[k]){
                result = result + romanNumberLimits[k];
                factor -= limits[k];
            }
        }
        return result;



//        - - - - - - GOOOOD - - - - -  -
//        while (factor >= 10) {
//            result = result + romanTen;
//            factor -= 10;
//        }
//        while (factor >= 9) {
//            result = result + romanOne + romanTen;
//            factor -= 9;
//        }
//        while (factor >= 5) {
//            result = result + romanFive;
//            factor -= 5;
//        }
//        while (factor >= 4) {
//            result = result + romanOne + romanFive;
//            factor -= 4;
//        }
//        while (factor >= 1) {
//            result = result + romanOne;
//            factor -= 1;
//        }
//        return result;

// - - - - - Old - - - - -
//        if (i >= 5) {
//            result = romanFive;
//            for(int h = 1; h < i -4; h++){
//                result = result + romanOne;
//            }
//            return result;
//        }
//        else if(i == 4){
//           return romanOne+romanFive;
//        }
//        else {
//            for (int j = 1; j <= i; j++) {
//                result = result + romanOne;
//            }
//            return result;
//        }
//
//
    }
}
