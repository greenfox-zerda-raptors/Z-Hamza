
public class Day4Ws {
    public static void main(String[] args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";
        int a1= first.length();
        int a2= second.length();
        if ((a1) > a2){
            System.out.println("First string is longer");
        }
        else
            System.out.println("Second string is longer");


        Boolean trueCondition = Boolean.TRUE;
        boolean trueBool = true;
        boolean falseBool = false;

        int v = 426;

        if ((v % 4) == 0){
            System.out.println("Yeah!");
        }

        System.out.println("End of program");


        int w = 24;
        int out = 0;
        if ((w % 2) == 0){
            out=out+1;
        }
        System.out.println(out);


        String y = "seasons";
        int out2 = 6;
        char aa= y.charAt(0);
        char bb= y.charAt(y.length()-1);
        if((aa) == bb){
            System.out.println(2 * out2);
        }
        else
            System.out.println(out2 / 2);


        int z=13;
         if ((z) <= 20 && z >=10){
             System.out.println("Sweet");
         }
        if ((z)<=10 ){
            System.out.println("Less");
        }
        if ((z)>=20 ){
            System.out.println("More");
        }
        int ab = 123;
        int credits = 100;
        Boolean is_bonus = false;
        //if(credits >= 50 && is_bonus = false){
        //ab=ab-2;
        //}
        //if (credits < 50 && is_bonus = false){

        //}

        // if credits are at least 50,
        // and is_bonus is False decrement ab by 2
        // if credits are smaller than 50,
        // and is_bonus is False decrement ab by 1
        // if is_bonus is True ab should remain the same


        int ac = 8;
        int time = 120;
        String out3 = "";
        if(ac % 4 == 0 && time <= 200){
            out3="check";
        }
        else if(ac % 4 == 0 && time > 200){
                out3 = "Time out";
        }
        else
            out3="Run Forest Run!";
        System.out.println(out3);
        // if ac is dividable by 4
        // and time is not more than 200
        // set out to 'check'
        // if time is more than 200
        // set out to 'Time out'
        // otherwise set out to 'Run Forest Run!'




    }
}
