import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Zoltán on 2016.12.07..
 */
public class GameObject {

    BufferedImage image;
    int posX, posY;

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX * 72;
        this.posY = posY * 72;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {

        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }

    public void move(int x, int y){
        posX += x*72;
        posY += y*72;

    }

    public void move(int x, int y, String filename, int whatIsIt){

        if(whatIsIt == 1) {
            posX += x * 72;
            posY += y * 72;
        }
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public int getPosX() {
        return posX/72;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY/72;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public String getPosXandY(){
        return getPosX()/72 + " " + getPosY()/72;
    }
}