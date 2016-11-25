import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class FractalTree extends JFrame {

    public FractalTree() {

        super("Fractal Tree");
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(1200,700);
        this.setResizable(false);
        this.setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {

        Random rand = new Random();
        float red1 = rand.nextFloat() / 2f ;
        float green1 = rand.nextFloat()/ 3f + 0.66f;
        float blue1 = rand.nextFloat()/ 2f;
        g.setColor(new Color(red1, green1, blue1));

        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 8.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 5.0);
        g.drawLine(x1, y1, x2, y2);


        drawTree(g, x2, y2, angle - 15, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }

    @Override
    public void paint(Graphics g) {
        drawTree(g, 500, 700, -90, 12);
    }

    public static void main(String[] args) {
        new FractalTree();
    }
}