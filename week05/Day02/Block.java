
public class Block extends Rectangle {
    int length;
    public Block(int length){
        this.length=length;
    }
    public Block(){
        this.length=1;
    }

    public Block(int length, int width, int heigth){
        super(heigth, width);
        this.length=length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Integer getLength(){
        return length;
    }
    public Integer getVolume(){

        int Volume = length * getArea();
        System.out.println("The volume is:   " + Volume);
        return Volume;
    }
}

