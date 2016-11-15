

public class Rectangle {
    int width;
    int height;
    int Area;
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(){
        this.width=1;
        this.height=1;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public Integer getHeigth(){
        return height;
    }
    public Integer getWidth(){
        return width;
    }
    public Integer getArea(){
        Area = width * height;
        System.out.println("The area is:   " + Area);
        return  Area;
    }
}
