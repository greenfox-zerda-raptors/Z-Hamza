import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Zoltán on 2016.12.07..
 */

public class Board extends JPanel implements KeyListener{

    boolean gameStatus = true;
    boolean gameWin = false;
    int mapLevel = 1;
    Map currentMap = new Map(mapLevel);

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
        setPreferredSize(new Dimension(1000, 800));
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
        graphics.fillRect(720, 0, 1000, 800);

        graphics.setColor(Color.BLACK);

        mainHero.writeOut(graphics, 0);

        if(currentMap.isThereEnemy(mainHero)){
            currentMap.findEnemy(mainHero).writeOut(graphics, 1);
        }
        if(gameStatus == false){
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("Courier New", Font.BOLD, 70));
            graphics.drawString("GAME OVER", 300, 350);
        }
        if(gameWin == true){
            graphics.setColor(Color.GREEN);
            graphics.setFont(new Font("Courier New", Font.BOLD, 70));
            graphics.drawString("VICTORY", 300, 350);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        if(gameWin == true){
            if(keyCode == KeyEvent.VK_ENTER){
                changeMap(1);
            }
        }
        if(gameStatus == true) {

            if (keyCode == KeyEvent.VK_LEFT) {
                int whatKind = currentMap.whatIsIt(mainHero.getPosY(), mainHero.getPosX() - 1);
                mainHero.move(-1, 0, heroLeftImg, whatKind);
            }

            if (keyCode == KeyEvent.VK_RIGHT) {
                int whatKind = currentMap.whatIsIt(mainHero.getPosY(), mainHero.getPosX() + 1);
                mainHero.move(1, 0, heroRightImg, whatKind);

            }

            if (keyCode == KeyEvent.VK_UP) {
                int whatKind = currentMap.whatIsIt(mainHero.getPosY() - 1, mainHero.getPosX());
                mainHero.move(0, -1, heroUpImg, whatKind);

            }

            if (keyCode == KeyEvent.VK_DOWN) {
                int whatKind = currentMap.whatIsIt(mainHero.getPosY() + 1, mainHero.getPosX());
                mainHero.move(0, 1, heroDownImg, whatKind);

            }

            if (keyCode == KeyEvent.VK_SPACE) {

                if (currentMap.isThereEnemy(mainHero)) {
                    mainHero.fight(mainHero, currentMap.findEnemy(mainHero));


                    if (currentMap.findEnemy(mainHero).getCurrentHealthPoint() <= 0) {
                        currentMap.enemyDeath(mainHero);
                    }
                }
            }
        }
        repaint();
        checkLoseGame();
        checkWinGame();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void checkLoseGame(){
        if(mainHero.isAlive == false){
            this.gameStatus = false;
        }
    }
    public void checkWinGame(){
        if(currentMap.areAllDead() == true){
            this.gameWin = true;
        }
    }
    public void changeMap(int number){

        this.currentMap.getMapArr().addRandomMap();

        this.mapLevel = mapLevel + number;
        this.currentMap = new Map(mapLevel);
        this.gameWin = false;
        this.gameStatus = true;
        this.mainHero.setPosX(0);
        this.mainHero.setPosY(0);
        mainHero.levelUp();
    }

}