import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Zoltán on 2016.12.07..
 */


public class Game extends JFrame {
    public Game() {

        new JFrame("maszkalos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        JPanel board = new Board();
        this.add(board);


        this.pack();
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }
}