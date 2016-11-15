/**
 * Created by Zoltán on 2016.11.14..
 */
public class Car {
    private String type;
    private String color;
    private int engine;
    private int odometer;
    private static int counter = 0;



    public void text(){
        System.out.println("This " + getType() + " is " +getColor() +  " has " + getEngine()
                + " cc engine and clocked " +getOdometer()+  " km's");
    }

    public void drive(int drive){
        this.odometer = odometer + drive;
        if (drive < 20 ){
            System.out.println("brrm, " + type + "just drove around town " + drive + "  clicks.");
        }
        else if ( drive > 50){
            System.out.println("brrm, screech, brrm, screech, "  + type+ " commuted " + drive + " clicks.");
        }
        else{
            System.out.println("whee, " +type + "in " + drive  +" clicks.");
        }
    }
    public Car(){
        counter ++;
    }
    public  Car(String type, String color, int engine){
        this();
        this.type = type;
        this.color = color;
        this.engine = engine;

    }
    public Car(String type, String color){
        this();
        this.type = type;
        this.color = color;
        this.engine = 1600;
        this.odometer = 10;

    }
    public Car(int engine, int odometer){
        this();
        this.type = "Mazda";
        this.color = "red";
        this.engine = engine;
        this.odometer = odometer;

    }
    public Car(String type, String color, int engine, int odometer){
        this();
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.odometer = odometer;

    }

    public void setColor(String color){
        this.color = color;
    }
    public void setEngine(int engine){
        this.engine = engine;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setOdometer(int odometer){
        this.odometer = odometer;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public Integer getEngine(){
        return engine;
    }
    public Integer getOdometer(){
        return odometer;
    }

    @Override
    public String toString() {
        return type + " " + color + " " + engine + " " + odometer;
    }
    public Integer getCount(){
        return counter;
    }
}