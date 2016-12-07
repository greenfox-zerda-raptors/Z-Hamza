import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.VK_DOWN;

/**
 * Created by Zoltán on 2016.12.07..
 */

public class Board extends JPanel implements KeyListener{

    Map mapOne = new Map();

    int heroPosX;
    int heroPosY;

    String heroDownImg = "images/hero-down.png";
    String heroUpImg = "images/hero-up.png";
    String heroLeftImg = "images/hero-left.png";
    String heroRightImg = "images/hero-right.png";
    String imageDirection = heroDownImg;

    Hero mainHero = new Hero(imageDirection, heroPosX, heroPosY);


    public Board() {

        addKeyListener(this);
        setPreferredSize(new Dimension(900, 800));
        setVisible(true);

//        addKeyListener(new MovementListener());

    }
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void paint(Graphics graphics){

        mapOne.draw(graphics);
        mainHero.draw(graphics);

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_LEFT) {
            int dummy = mapOne.whatIsIt(mainHero.getPosY()/72,mainHero.getPosX()/72 -1);
            mainHero.move(-1, 0, heroLeftImg, dummy);


        }

        if (keyCode == KeyEvent.VK_RIGHT) {
            int dummy = mapOne.whatIsIt(mainHero.getPosY()/72,mainHero.getPosX()/72+1);
                mainHero.move(1, 0, heroRightImg, dummy);

        }

        if (keyCode == KeyEvent.VK_UP) {
            int dummy = mapOne.whatIsIt(mainHero.getPosY()/72-1,mainHero.getPosX()/72);
            mainHero.move(0, -1, heroUpImg, dummy);

        }

        if (keyCode == KeyEvent.VK_DOWN) {
            int dummy = mapOne.whatIsIt(mainHero.getPosY()/72+1,mainHero.getPosX()/72);
            mainHero.move(0, 1, heroDownImg, dummy);

        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

        }
    @Override
    public void keyReleased(KeyEvent e) {

    }

}