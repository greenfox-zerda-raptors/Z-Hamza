
import javax.swing.*;
import java.awt.*;



public class ImageApp extends JFrame {

    public ImageApp() throws HeadlessException {
        setDefaultCloseOperation(3);

        Image Bullshit = new ImageIcon("C:/Users/Zoltán/Desktop/JFramePractice/src/2.jpg").getImage();
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                requestFocus();
                pack();
                graphics.drawImage(Bullshit, 0,0, this);
            }
        };
        panel.setPreferredSize(new Dimension(Bullshit.getWidth(null), Bullshit.getHeight(null)));
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageApp();
            }
        });

    }
}