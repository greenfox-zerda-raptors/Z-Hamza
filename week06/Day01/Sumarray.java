package Week06;

import java.util.ArrayList;

public class Sumarray {
    ArrayList<Integer> sumarray = new ArrayList<Integer>();

    public Sumarray(){

    }
    public void add(int number){
        sumarray.add(number);
    }
    public Integer Sum(){
        int sum=0;
        for(int i = 0; i<sumarray.size(); i++){
            sum = sum + sumarray.get(i);
        }
        return sum;
    }
}
