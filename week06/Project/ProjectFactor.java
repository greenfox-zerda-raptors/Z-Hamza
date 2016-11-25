import javax.swing.*;
import java.awt.*;

/**
 * Created by Zoltán on 2016.11.24..
 */
public class ProjectFactor extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProjectFactor();
            }
        });
    }


    private ProjectFactor() {


        this.setSize(540, 540);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(new Triangle());


    }

}
