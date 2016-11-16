package com.Ws05;

import java.util.Comparator;

public class Model implements Comparable<Model>{
    public String name;
    public String size;
    public int rtV4M;

    public Model(){

    }
    public Model(String name, String size, int rtV4M) {
        this.name = name;
        this.size = size;
        this.rtV4M = rtV4M;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setrtV4M(int rtV4M) {
        this.rtV4M = rtV4M;
    }

    public int getrtV4M() {
        return rtV4M;
    }


    public String toString() {
        System.out.printf("%s - %s diagonal (%d)", name, size, rtV4M);
        return "";
    }
    public int compareTo(Model compareModel) {

        int comparertV4M = ((Model) compareModel).getrtV4M();

        //ascending order
        return this.rtV4M- comparertV4M;

        //descending order
        //return compareQuantity - this.quantity;

    }
    public static Comparator<Model> ModelNameComparator = new Comparator<Model>() {
        public int compare (Model model1, Model model2) {
            String left = model1.getName().toUpperCase();
            String right = model2.getName().toUpperCase();
            return left.compareTo(right);
        }
    };
    public static Comparator<Model> ModelSizeComparator = new Comparator<Model>() {
        public int compare (Model model1, Model model2) {
            String left = model1.getSize().toUpperCase();
            String right = model2.getSize().toUpperCase();
            return left.compareTo(right);
        }
    };
}
