import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Zoltán on 2016.12.07..
 */

public class Board extends JPanel implements KeyListener{

    Map currentMap = new Map();

    int heroPosX;
    int heroPosY;

    String skeletonImg = "images/skeleton.png";
    String heroDownImg = "images/hero-down.png";
    String heroUpImg = "images/hero-up.png";
    String heroLeftImg = "images/hero-left.png";
    String heroRightImg = "images/hero-right.png";
    String bossImg = "images/boss.png";


    Hero mainHero = new Hero(heroDownImg, heroPosX, heroPosY);


    public Board() {

        addKeyListener(this);
        setPreferredSize(new Dimension(900, 800));
        setVisible(true);

    }
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void paint(Graphics graphics){


        currentMap.draw(graphics);
        mainHero.draw(graphics);

//        - - - - - The info list on the right side - - - - - - -
        graphics.setColor(Color.WHITE); // White rectangle to "refresh" the details
        graphics.fillRect(720, 0, 900, 800);

        graphics.setColor(Color.BLACK);
        mainHero.writeOut(graphics, 0);

        if(currentMap.isThereEnemy(mainHero)){
            currentMap.findEnemy(mainHero).writeOut(graphics, 1);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_LEFT) {
            int whatKind = currentMap.whatIsIt(mainHero.getPosY(),mainHero.getPosX() -1);
            mainHero.move(-1, 0, heroLeftImg, whatKind);


        }

        if (keyCode == KeyEvent.VK_RIGHT) {
            int whatKind = currentMap.whatIsIt(mainHero.getPosY(),mainHero.getPosX()+1);
            mainHero.move(1, 0, heroRightImg, whatKind);

        }

        if (keyCode == KeyEvent.VK_UP) {
            int whatKind = currentMap.whatIsIt(mainHero.getPosY()-1,mainHero.getPosX());
            mainHero.move(0, -1, heroUpImg, whatKind);

        }

        if (keyCode == KeyEvent.VK_DOWN) {
            int whatKind = currentMap.whatIsIt(mainHero.getPosY()+1,mainHero.getPosX());
            mainHero.move(0, 1, heroDownImg, whatKind);

        }

        if( keyCode ==KeyEvent.VK_SPACE) {

            if(currentMap.isThereEnemy(mainHero)){
                mainHero.fight(mainHero, currentMap.findEnemy(mainHero));


                if(currentMap.findEnemy(mainHero).getCurrentHealthPoint() <= 0){
                    currentMap.enemyDeath(mainHero);
                }
            }
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