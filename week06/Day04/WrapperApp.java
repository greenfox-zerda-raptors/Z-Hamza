import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class WrapperApp extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp();
            }
        });
    }
    private WrapperApp() {
        this.setSize(500, 500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        setJMenuBar();
    }

//- - - - - - - - The menubar - - - - - - -
    private void setJMenuBar() {

        JMenuBar menubar = new JMenuBar();


//        - - - - - If you wanna add an icon next to the menubar - - - - -
//        ImageIcon icon = new ImageIcon("exit.png");
//        JMenu file = new JMenu("File", icon);

//        - - - - - - The menu properties - - - - - - -
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.setToolTipText("Exit application");


//        - - - - - Another solution - - - - - -
//        exitMenuItem.addActionListener((ActionEvent event) -> {
//            System.exit(0);
//        });


        exitMenuItem.addActionListener(new Exitaction());
        fileMenu.add(exitMenuItem);

        menubar.add(fileMenu);

        setJMenuBar(menubar);

    }


//    - - - -  - This can be replaced with the "Another solution" - - - - - -
    private class Exitaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
//    - - - - - - - - - Menubar E N D - - - - - - -
}
