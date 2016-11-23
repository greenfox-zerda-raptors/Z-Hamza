import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame{
    private JButton buttonCounter, buttonReset;
    private int clicks = 0;
    private JLabel LabelCount = new JLabel();
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

        JPanel panel = new JPanel();
        setTitle("Button Counter");
        panel.add(LabelCount);

        buttonCounter = new JButton("Press me");
        panel.add(buttonCounter);
        buttonCounter.addActionListener(new ButtonCounterActionListener());


        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ButtonResetActionListener());

        panel.add(buttonReset);
        add(panel);
        setVisible(true);
        updateCounter();

    }
    private void createCounter(){

        this.setSize(300,100);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
    }
    private void updateCounter(){
        LabelCount.setText("Pressed: " + clicks);
    }

    private class ButtonCounterActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }

    private class ButtonResetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks = 0;
            updateCounter();
        }
    }
}
