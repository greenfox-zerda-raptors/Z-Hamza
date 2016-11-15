import java.util.*;

public class Garage {
    private String[] colors =  {"white", "blue", "red", "silver", "black", "green", "banana"};
    private String[] makes = {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes", "ferrari"};
    private Integer[] enginesizes = {1100, 1400, 1600, 1800, 2500};


    ArrayList<Car> garage = new ArrayList();
    Random rnd = new Random();
    public Garage() {
        for (int i = 0; i < 5; i++) {
            int rnde = rnd.nextInt(enginesizes.length);
            int rndm = rnd.nextInt(makes.length);
            int rndc = rnd.nextInt(colors.length);
            Car car001 = new Car(makes[rndm], colors[rndc], enginesizes[rnde]);
            garage.add(i, car001);
        }
    }

    public void addRandomCar(){
        int rnde = rnd.nextInt(enginesizes.length);
        int rndm = rnd.nextInt(makes.length);
        int rndc = rnd.nextInt(colors.length);
        Car car001 = new Car(makes[rndm], colors[rndc], enginesizes[rnde]);
        garage.add(car001);
    }
    public void addCar(String type, String color, int engine, int odometer){
        Car car001 = new Car(type, color, engine, odometer);
    }


}
