import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Zoltán on 2016.12.07..
 */


public class Game extends JFrame {

    public Game() {

        new JFrame("RPG Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel board = new Board();
        this.add(board);

//        this.addKeyListener(new TestListener);
        this.pack();
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }


}
