import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame{
    private JButton buttonCounter, buttonReset;
    private int buttonclicks = 0;
    private int keypresses = 0;
    private int mouseclicks = 0;
    private int windowusage = 0;

    private JLabel LabelButtonCount = new JLabel();
    private JLabel LabelKeyCount = new JLabel();
    private JLabel LabelMouseCount = new JLabel();
    private JLabel LabelWindowCount = new JLabel();

    private JTextField textField = new JTextField();



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }
    private Counter(){
        createCounter();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension emptyarea = new Dimension(400,20);

        JPanel panel = new JPanel();
        setTitle("Button Counter");

        panel.add(Box.createRigidArea(emptyarea));
        panel.add(LabelButtonCount);
        panel.add(LabelKeyCount);
        panel.add(LabelMouseCount);
        panel.add(LabelWindowCount);
        panel.add(Box.createRigidArea(emptyarea));
        panel.add(textField);
        panel.add(Box.createRigidArea(emptyarea));

        textField.setPreferredSize(new Dimension(300, textField.getMinimumSize().height));
        textField.addKeyListener(new listenforKeys());


        buttonCounter = new JButton("Press me");
        panel.add(buttonCounter);
        buttonCounter.addActionListener(new ButtonCounterActionListener());

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonResetActionListener());

        this.addMouseListener(new listenforMouse());
        this.addWindowListener(new listenforWindow());
        panel.add(buttonReset);
        add(panel);
        setVisible(true);


        updateButtonCounter();
        updateWindowCounter();
        updateKeyCounter();
        updateMouseCounter();

    }
    private void createCounter(){

        this.setSize(450,200);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
    }
    private void updateButtonCounter(){
        LabelButtonCount.setText("Button pressed: " + buttonclicks + "   ");
    }
    private void updateKeyCounter(){
        LabelKeyCount.setText("Key presses: " +keypresses + "   ");
    }
    private void updateMouseCounter(){
        LabelMouseCount.setText("Mouse clicks: " + mouseclicks + "   ");
    }
    private void updateWindowCounter(){
        LabelWindowCount.setText("Window thingy: " + windowusage);
    }


    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonclicks++;
            updateButtonCounter();
        }
    }

    private class ButtonResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonclicks = 0;
            windowusage = 0;
            mouseclicks = 0;
            keypresses = 0;
            updateButtonCounter();
            updateWindowCounter();
            updateKeyCounter();
            updateMouseCounter();
        }
    }

    private class listenforMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            mouseclicks++;
            updateMouseCounter();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void mouseExited(MouseEvent e) {
            windowusage++;
            updateWindowCounter();
        }
    }

    private class listenforWindow implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowClosing(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowIconified(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowActivated(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            windowusage++;
            updateWindowCounter();
        }
    }

    private class listenforKeys implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            keypresses++;
            updateKeyCounter();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
