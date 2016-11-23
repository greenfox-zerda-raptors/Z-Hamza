import javax.swing.*;
import java.awt.*;

/**
 * Created by Zoltán on 2016.11.23..
 */
public class HelloWorld extends JFrame {


    public static void main(String[] args) {

        new HelloWorld();
    }

    public HelloWorld(){

        this.setSize(500,500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width /2 ) - (this.getWidth()/2);
        int yPos = (dim.height /2 ) - (this.getHeight()/2);

        this.setLocation(xPos, yPos);
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Hi there!");
//        label1.setText("OMG");
        this.setTitle("Hello World");
        panel.add(label1);
        this.add(panel);

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        for(String helloi : hellos){
            panel.add( new JLabel(helloi + "!"));
        }

        this.setVisible(true);


    }
}
