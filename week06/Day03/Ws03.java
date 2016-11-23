import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ws03 extends JFrame {

    private JButton buttonCl;
    private JLabel  labelText= new JLabel();
    private JLabel labelMemory = new JLabel();
    private String textfromField = new String();
    JTextField textField = new JTextField("Type in the info");


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ws03();
            }
        });
    }


    public Ws03(){

//      JFrame properties  - - - - - - - - - - - - - -
        this.setSize(300,300);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JFRame properties  -- E N D -- - - - - - - -
        Dimension a = new Dimension(0,25);

//      Content of the JFrame - - - - - - - - - - - - - - -
        this.setTitle("Ws03");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

//        Textfield
        panel.add(Box.createRigidArea(a));
        panel.add(textField);
        textField.addActionListener(new textFieldActionListener());
        panel.add(Box.createRigidArea(a));
//        Memories
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField.getMinimumSize().height));
        labelText.setText(textfromField);
        panel.add(labelText);
        panel.add(Box.createRigidArea(a));

        panel.add(labelMemory);
        panel.add(Box.createRigidArea(a));
        this.add(panel);

//`       The clear button
        buttonCl = new JButton("Clear");
        buttonCl.addActionListener(new ButtonClearActionListener());
        panel.add(buttonCl);
        panel.add(Box.createRigidArea(a));
        saveText();
        updateText();


    }
    private void updateText(){
       labelText.setText("Text: " + textfromField);
    }
    private void saveText(){
        labelMemory.setText("Prev text: " + textfromField);
    }

    private class textFieldActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveText();
            textfromField  = textField.getText();
            updateText();

        }
    }

    private class ButtonClearActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textfromField = "";
            textField.setText(null);
            saveText();
            updateText();
        }
    }
}
