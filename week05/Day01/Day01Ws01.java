import java.util.*;

public class Day01Ws01 {
    public static void main(String[] args){
        Car myCar1 = new Car();
        myCar1.setType("Mazda");
        myCar1.setColor("red");
        myCar1.setEngine(1600);
        myCar1.setOdometer(12343);
        myCar1.drive(15);
        myCar1.text();
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//               myCar1.getType(), myCar1.getColor(), myCar1.getEngine(), myCar1.getOdometer());
        Car myCar2 = new Car();
        myCar2.setType("Ford");
        myCar2.setColor("silver");
        myCar2.setEngine(2500);
        myCar2.setOdometer(4324);
        myCar2.drive(49);
        myCar2.text();
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//                myCar2.getType(), myCar2.getColor(), myCar2.getEngine(), myCar2.getOdometer());

        Car myCar3 = new Car();
        myCar3.setType("Opel");
        myCar3.setColor("blue");
        myCar3.setEngine(2800);
        myCar3.setOdometer(437924);
        myCar3.drive(1200);
        myCar3.text();
        Car myCar05 = new Car("Opel", "white", 1400, 25);
        Car myCar06 = new Car("VW", "grey"); // defaults to 1600 cc, 10 kms
        Car myCar07 = new Car(1100, 15); // defaults to a red Mazda
        myCar05.text();
        myCar06.text();
        myCar07.text();
//
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//                myCar3.getType(), myCar3.getColor(), myCar3.getEngine(), myCar3.getOdometer());
//






//        Previous Solutions

//        Car myCar1 = new Car("red", 1600, 123432, "Mazda");
//
//        Car myCar2 = new Car("silver", 2500, 2345, "Ford");
//
//        Car myCar3 = new Car("green", 2800, 87668, "Beamer");
//
//
//        //sout "This %s is %s, has %d cc engine and clocked %d km's\n"
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//                myCar1.type, myCar1.color, myCar1.engine, myCar1.odometer);
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//                myCar2.type, myCar2.color, myCar2.engine, myCar2.odometer);
//        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
//                myCar3.type, myCar3.color, myCar3.engine, myCar3.odometer);

  }

}
