
public class Circle {


    private int radius;
    private static int counter = 0;


    public Circle (int radius){
        counter ++;
        this.radius = radius;
    }
    public Circle(){
        counter++;
        this.radius = 1;
    }
    public double getPerimeter(){
        double a = 2*radius *Math.PI;
        return a;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public Integer countObjects(){
        return counter;
    }
}
