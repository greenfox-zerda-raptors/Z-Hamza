package com.Ws05;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> tvModels= new ArrayList<String>();

        tvModels.add("Samsung S19E200BW");
        tvModels.add("LG 19MB35D");
        tvModels.add("NEC MultiSync EA193Mi");
        tvModels.add("Asus VE198S");

//do something here
       Collections.sort(tvModels);
//write the output now
        for(String itvModels : tvModels){
            System.out.println(itvModels);
        }
    }
}
