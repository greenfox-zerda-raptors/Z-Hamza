import java.util.Arrays;

public class Day5Ws1 {
    public static void main(String[] args) {


        // get the 3rd element of q
        int[] q = new int[]{4, 5, 6, 7};
        System.out.println("Ws1:  " + q[2]);


        // tell if p2 has more elements than p1
        int[] p1 = new int[]{1, 2, 3};
        int[] p2 = new int[]{4, 5};
        if (p1.length <= p2.length) {
            System.out.println("Ws2:   " + "p2 has more elements");
        } else {
            System.out.println("Ws2:   " + "p2 has less elements");
        }


        // add the second the third
        int[] r = new int[] { 54, 23, 66, 12};
        System.out.println();


        // change the 8 to 4
        int[] s = new int[] { 1, 2, 3, 8, 5, 6 };
        s[3]=4;
        System.out.println("Ws4:   " + Arrays.toString(s));


        // increment the 3rd element
        int[] t = new int[] { 1, 2, 3, 4, 5 };
        t[2]=t[2]+10;
        System.out.println("Ws5:   "+Arrays.toString(t));


        // print all the elements of af
        int[] af = new int[] { 4, 5, 6, 7 };
        int n=0;
        for (n=0; n<=3; n++ )
            System.out.println("Ws6:" + " element " + (n+1) + "   " + af[n]);



        // What's the problem with this code fragment? Fix it!
        int[] array =new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = i * i;
        System.out.println("Ws7:    " + Arrays.toString(array));

        // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1
        // Task 2: Print this two dimensional array to the output
        int[][] identity = new int[4][4];
        System.out.println("Ws 8:");
        for (int ff=0; ff<4; ff++) {
            identity[ff][ff] = 1;
            System.out.println(Arrays.toString(identity[ff]));
        }

        // please double all the elements of the list
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        for(int ss=0; ss<5; ss++)
            ag[ss]=ag[ss]*2;
        System.out.println("Ws9:     " + Arrays.toString(ag));

        // Task 1: Create an array (jagged) which can contain the different shades of specified colors
        // in colors[0] store the shades of green: "lime", "forest green", "olive", "pale green", "spring green"
        // in colors[1] store the shades of red: "orange red", "red", "tomato"
        // in colors[2] store the shades of pink: "orchid", "violet", "pink", "hot pink"

        // Task 2: Print the values of the array to the console

//         String[][] colors= new String[][]{ {"lime", "forest green", "olive", "pale green", "spring green"},{"orange red", "red", "tomato"},{ "orchid", "violet", "pink", "hot pink"}};
        String[][] colors= new String[3][5];
        colors[0]= new String[]{"lime", "forest green", "olive", "pale green", "spring green"};
        colors[1]= new String[]{ "orange red", "red", "tomato"};
        colors[2]= new String[]{"orchid", "violet", "pink", "hot pink"};

        System.out.println("Ws10:    " + Arrays.deepToString(colors));

        // add to all elements an 'a' on the end
        String[] ah = new String[] { "kuty", "macsk", "cic" };
        for(int ii=0; ii<ah.length; ii++)
            ah[ii]=ah[ii]+"a";
        System.out.println("Ws11:    " + Arrays.toString(ah));

        // Swap the first element of the array
        // Expected outpt: third second first
        String[] abc = new String[] { "first", "second", "third" };
        String[] abc2 = new String[3];
        for(int i=0; i<abc.length; i++) {

            abc2[i]=abc[Math.abs(i-2)];
        }
        System.out.println("Ws12:    " + Arrays.toString(abc2));


        // print the sum of all numbers in ah
        int sum=0;
        int[] aj = new int[]  { 3, 4, 5, 6, 7 };
        for(int nn=0; nn<5; nn++)
            sum=sum+aj[nn];
        System.out.println("W13:     " + sum);


        // Reverse the order of ah
        int[] ak = new int[]  { 3, 4, 5, 6, 7 };
        int [] ak2 = new int[ak.length];
        for(int iii=0; iii<=abc.length+1; iii++)
            ak2[iii]=ak[Math.abs(iii-4)];
        System.out.println("WS14:    " + Arrays.toString(ak2));



        
    }
}