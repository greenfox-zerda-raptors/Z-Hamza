import javax.swing.*;
import java.awt.*;

/**
 * Created by Zoltán on 2016.11.24..
 */
public class Triangle extends JPanel {
    Toolkit tk = Toolkit.getDefaultToolkit();
        @Override
        public void paintComponent (Graphics graphics){
            super.paintComponent(graphics);
            requestFocus();
            int a = 500;
            double heightconst = 2 * Math.tan(60.0);
            int[] cornerA = new int[]{0, 0};
            int[] cornerB = new int[]{250, 433};
            int[] cornerC = new int[]{500, 0};
            graphics.drawLine(cornerA[0], cornerA[1], cornerB[0], cornerB[1]);
            graphics.drawLine(cornerA[0], cornerA[1], cornerC[0], cornerC[1]);
            graphics.drawLine(cornerC[0], cornerC[1], cornerB[0], cornerB[1]);


            graphics.drawLine(250, 0, 125, 216);
            graphics.drawLine(250, 0, 375, 216);
            graphics.drawLine(125, 216, 375, 216);

            int[] coordinates = new int[]{250,0,216};

            graphics.drawLine(calculateCoordinateA(coordinates)[0], calculateCoordinateA(coordinates)[1], calculateCoordinateB(coordinates)[0], calculateCoordinateB(coordinates)[1]);
            graphics.drawLine(calculateCoordinateA(coordinates)[0], calculateCoordinateA(coordinates)[1], calculateCoordinateC(coordinates)[0], calculateCoordinateC(coordinates)[1]);
            graphics.drawLine(calculateCoordinateB(coordinates)[0], calculateCoordinateB(coordinates)[1], calculateCoordinateC(coordinates)[0], calculateCoordinateC(coordinates)[1]);

            graphics.drawLine(calculateCoordinateA(coordinates)[2], calculateCoordinateA(coordinates)[3], calculateCoordinateB(coordinates)[2], calculateCoordinateB(coordinates)[3]);
            graphics.drawLine(calculateCoordinateA(coordinates)[2], calculateCoordinateA(coordinates)[3], calculateCoordinateC(coordinates)[2], calculateCoordinateC(coordinates)[3]);
            graphics.drawLine(calculateCoordinateB(coordinates)[2], calculateCoordinateB(coordinates)[3], calculateCoordinateC(coordinates)[2], calculateCoordinateC(coordinates)[3]);

            graphics.drawLine(calculateCoordinateA(coordinates)[4], calculateCoordinateA(coordinates)[5], calculateCoordinateB(coordinates)[4], calculateCoordinateB(coordinates)[5]);
            graphics.drawLine(calculateCoordinateA(coordinates)[4], calculateCoordinateA(coordinates)[5], calculateCoordinateC(coordinates)[4], calculateCoordinateC(coordinates)[5]);
            graphics.drawLine(calculateCoordinateB(coordinates)[4], calculateCoordinateB(coordinates)[5], calculateCoordinateC(coordinates)[4], calculateCoordinateC(coordinates)[5]);

        }
    private int[] calculateCoordinateA(int[] coordinates){
        int[] cornerA = new int[]{
                coordinates[0]/2, coordinates[1],
                coordinates[0]+coordinates[0]/2, coordinates[1],
                coordinates[0], coordinates[1]+coordinates[2]};
//        x/2, y, x+x/2, y, x, y+heigth;
        return cornerA;

    }
    private int[] calculateCoordinateB(int[] coordinates){
        int[] cornerB = new int[]{
                coordinates[0] / 2 + coordinates[0] / 4,  coordinates[1] + coordinates[2] / 2,
                coordinates[0] + coordinates[0] / 4, coordinates[1] + coordinates[2] / 2,
                coordinates[0]/2 + coordinates[0] / 4, coordinates[1]+coordinates[2]+coordinates[2]/2};
//                x/2 + x/4, y + heigth/2, x+x/2-x/4, y+heigth/2, x/2+x/4, y+heigth+heigth/2
        return cornerB;
    }
    private int[] calculateCoordinateC(int[] coordinates){
        int[] cornerC = new int[]{
                coordinates[0]/2 - coordinates[0]/4, coordinates[1]+coordinates[2]/2,
                coordinates[0]+coordinates[0]/2+coordinates[0]/4, coordinates[1]+coordinates[2]/2,
                coordinates[0]+coordinates[0]/2-coordinates[0]/4, coordinates[1]+coordinates[2]+coordinates[2]/2
        };
//                x/2 - x/4, y + heigth/2, x+x/2+x/4, y+heigth/2, x +x/2-x/4, y+heigth+heigth/2
        return cornerC;

    }




}
