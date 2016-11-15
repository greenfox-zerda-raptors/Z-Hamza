/**
 * Created by Zoltán on 2016.11.14..
 */
public class Cricletest {
    public static void main(String[] args) {
        Circle a = new Circle();
        System.out.println("Default circle perimeter:  " + a.getPerimeter());
        System.out.println("Default circle area:  " + a.getArea());
        Circle b = new Circle(5);
        System.out.println("User created circle perimeter:   " + b.getPerimeter());
        System.out.println("User created circle area:   " + b.getArea());
    }
}
