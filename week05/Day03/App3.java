package com.Ws05;
import java.util.*;
public class App {
    public static void main(String[] args) {

        Model[] model = new Model[4];
        model[0]= new Model("Samsung S19E200BW", "19", 5);
        model[1]= new Model("LG 19MB35D", "18", 2);
        model[2]= new Model("NEC MultiSync EA193Mi", "18",8);
        model[3]= new Model("Asus VE198S", "17", 6);

        for( Model i: model) {
            System.out.println(i.toString());
        }

        Arrays.sort(model, Model.ModelNameComparator);
        System.out.println("Comparing name");
        for( Model i: model) {
            System.out.println(i.toString());
        }
        System.out.println("Comparing size");
        Arrays.sort(model, Model.ModelSizeComparator);
        for( Model i: model) {
            System.out.println(i.toString());
        }


    }
}
