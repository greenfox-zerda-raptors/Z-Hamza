/**
 * Created by Zoltán on 2016.11.15..
 */
public class Square {
    int length;
    public Square(){
        this.length=1;
    }
    public Square(int length){
        this.length=length;
    }
    public Integer getArea(){
        int Area = length*length;
        System.out.println("Square area:  " + Area );
        return Area;
    }

}
