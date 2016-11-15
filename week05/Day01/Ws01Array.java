import java.util.*;
public class Ws01Array {
    public static void main(String[] args){
        String[] colors =  {"white", "blue", "red", "silver", "black", "green", "banana"};
        String[] makes = {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"};
        Integer[] enginesizes = {1100, 1400, 1600, 1800, 2500};
        ArrayList<Car> lsCars= new ArrayList(10);

        Random rnd = new Random();

        for(int i = 0; i<10; i++){
            int rnde = rnd.nextInt(enginesizes.length);
            int rndm = rnd.nextInt(makes.length);
            int rndc = rnd.nextInt(colors.length);
            Car car001 = new Car(makes[rndm], colors[rndc], enginesizes[rnde]);
//            car001.text();
            lsCars.add(i, car001);
            System.out.println(lsCars.get(i).toString());
            System.out.println(car001.getCount());


            if(i == 9){
                System.out.println("The number of cars is:   " + car001.getCount());
            }

        }
//        for(int i = 0; i<10; i++){
//            System.out.println(lsCars.get(i).toString());
//        }

    }
}
