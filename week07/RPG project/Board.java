import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zoltán on 2016.12.07..
 */

public class Board extends JPanel{

    public Board() {

        setPreferredSize(new Dimension(900, 800));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics){
        Map mapOne = new Map();
        super.paint(graphics);
        mapOne.draw(graphics);
    }
}