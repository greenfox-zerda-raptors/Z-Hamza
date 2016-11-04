
public class Day4Ws2 {
    public static void main(String[] args) {
        int ad = 6;
        // print the numbers till ad from 0
        while (ad >= 0) {
            System.out.println(ad);
            ad--;

        }
        int ae = 4;
        String text = "Gold";
        // print content of the text variable ae times
        do {
            System.out.println(text);
            ae--;
        } while (ae > 0);


        // print the even numbers till 20
        int al = 0;
        do {
            System.out.println(al);
            al += 2;
        } while (al <= 20);

        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".


        int ak = 0;
        do {
            ak += 1;
            if ((ak % 5 == 0) && ak % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if ((ak % 5 == 0)) {
                System.out.println("Buzz");
            } else if ((ak % 3) == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(ak);
        } while (ak < 100);

        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567
        String alma="*******";
        int x=0;
        do{
            alma = alma.substring(0 , x) + (x + 1) + alma.substring(x , 6);
            x+=1;
            System.out.println(alma);
        }while ( x < 7 );
// Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        String hash="#";
        String space=" ";
        String sajt="";
        int xx=0;
        int c=0;
        for(c=1; c<=5; c++) {
            sajt = sajt + hash + " ";

//            for(xx=1; xx<=7; xx++) {

            }
        for( xx=1; xx<=5; xx++) {
            System.out.println(sajt);
        }


        // Write a program which has this output
        //# # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replaceable, hence store it in a variable
        String sajt1="";
        String sajt2="";
        for(xx=1; xx<=7; xx++) {
            sajt1 = sajt1 + " " + hash;
        }
        for(xx=1; xx<=7; xx++){
            sajt2 = sajt2 + hash + " ";
        }
        System.out.println(sajt1);
        System.out.println(sajt2);





    }
}

