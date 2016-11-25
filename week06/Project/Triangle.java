import javax.swing.*;
import java.awt.*;

/**
 * Created by Zoltán on 2016.11.24..
 */
public class Triangle extends JPanel {
    Toolkit tk = Toolkit.getDefaultToolkit();
    @Override
    public void paintComponent (Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();


//        - - - - - - The base triangle - - - - - - -
        int a = 256;
        int shiftx =20 ;
        int shifty =20 ;
        int m = (int)Math.round(a*Math.sqrt(3)/2);


//        - - - - - Drawing and the frame triangle the base triangle - - - - - -
        int[] cornerA = new int[]{0+shiftx, 0+shifty};
        int[] cornerB = new int[]{a+shiftx, 2*m+shifty};
        int[] cornerC = new int[]{2*a+shiftx, 0 + shifty};

        graphics.drawLine(cornerA[0], cornerA[1], cornerB[0], cornerB[1]);
        graphics.drawLine(cornerA[0], cornerA[1], cornerC[0], cornerC[1]);
        graphics.drawLine(cornerC[0], cornerC[1], cornerB[0], cornerB[1]);

        graphics.drawLine(a+shiftx,shifty, a/2+shiftx, m + shifty);
        graphics.drawLine(a+shiftx,shifty, a+a/2+shiftx, m+shifty);
        graphics.drawLine(a/2+shiftx, m + shifty,a+a/2+shiftx, m+shifty);

//         - - - - - Calling the recursive function - - - - - - -

        drawTriangles(graphics, new int[]{a+shiftx, 0+shifty, m, a});

    }
//   - - - - - The triangle drawing function - - - - - - -
    private void drawTriangles(Graphics graphics, int[] coordinates) {


        graphics.drawLine(calculateCoordinateA(coordinates)[0], calculateCoordinateA(coordinates)[1], calculateCoordinateB(coordinates)[0], calculateCoordinateB(coordinates)[1]);
        graphics.drawLine(calculateCoordinateA(coordinates)[0], calculateCoordinateA(coordinates)[1], calculateCoordinateC(coordinates)[0], calculateCoordinateC(coordinates)[1]);
        graphics.drawLine(calculateCoordinateB(coordinates)[0], calculateCoordinateB(coordinates)[1], calculateCoordinateC(coordinates)[0], calculateCoordinateC(coordinates)[1]);

        graphics.drawLine(calculateCoordinateA(coordinates)[2], calculateCoordinateA(coordinates)[3], calculateCoordinateB(coordinates)[2], calculateCoordinateB(coordinates)[3]);
        graphics.drawLine(calculateCoordinateA(coordinates)[2], calculateCoordinateA(coordinates)[3], calculateCoordinateC(coordinates)[2], calculateCoordinateC(coordinates)[3]);
        graphics.drawLine(calculateCoordinateB(coordinates)[2], calculateCoordinateB(coordinates)[3], calculateCoordinateC(coordinates)[2], calculateCoordinateC(coordinates)[3]);

        graphics.drawLine(calculateCoordinateA(coordinates)[4], calculateCoordinateA(coordinates)[5], calculateCoordinateB(coordinates)[4], calculateCoordinateB(coordinates)[5]);
        graphics.drawLine(calculateCoordinateA(coordinates)[4], calculateCoordinateA(coordinates)[5], calculateCoordinateC(coordinates)[4], calculateCoordinateC(coordinates)[5]);
        graphics.drawLine(calculateCoordinateB(coordinates)[4], calculateCoordinateB(coordinates)[5], calculateCoordinateC(coordinates)[4], calculateCoordinateC(coordinates)[5]);
        if (coordinates[2] > 25) {
            drawTriangles(graphics, getCoordinatesone(coordinates));
            drawTriangles(graphics, getCoordinatestwo(coordinates));
            drawTriangles(graphics, getCoordinatesthree(coordinates));
        }else{

        }
    }

// - - - - - The calculators for the coordinates - - - - - -
    private int[] calculateCoordinateA(int[] coordinates){
        int[] cornerA = new int[]{
                coordinates[0] - coordinates[3]/2, coordinates[1],
                coordinates[0] + coordinates[3]/2, coordinates[1],
                coordinates[0], coordinates[1]+coordinates[2],
                coordinates[2]/2, coordinates[3]/2
        };
        return cornerA;

    }
    private int[] calculateCoordinateB(int[] coordinates){
        int[] cornerB = new int[]{
                coordinates[0] - coordinates[3]/4, coordinates[1]+coordinates[2]/2,
                coordinates[0] + coordinates[3]/2+coordinates[3]/4, coordinates[1]+coordinates[2]/2,
                coordinates[0] + coordinates[3]/4, coordinates[1]+coordinates[2]+coordinates[2]/2,
                coordinates[2]/2, coordinates[3]/2

        };
        return cornerB;
    }
    private int[] calculateCoordinateC(int[] coordinates){
        int[] cornerC = new int[]{
                coordinates[0] - coordinates[3]/4 - coordinates[3]/2, coordinates[1]+coordinates[2]/2,
                coordinates[0] + coordinates[3]/4,  coordinates[1]+coordinates[2]/2,
                coordinates[0] - coordinates[3]/4,  coordinates[1]+coordinates[2] + coordinates[2]/2,
                coordinates[2]/2, coordinates[3]/2

        };
        return cornerC;

    }

//    - - - - - Getting the new coordinates for the triangles - - - - - - -

    private int[] getCoordinatesone(int[] cord){
        int[] a = calculateCoordinateA(cord);
        int[] result = new int[4];


        result[0] = a[0];
        result[1] = a[1];
        result[2] = a[6];
        result[3] = a[7];
        return result;

    }
    private int[] getCoordinatestwo(int[] cord){
        int[] a = calculateCoordinateA(cord);

        int[] result = new int[4];
        result[0]= a[2];
        result[1]= a[3];
        result[2]= a[6];
        result[3] = a[7];

        return result;
    }
    private int[] getCoordinatesthree(int[] cord){
        int[] a = calculateCoordinateA(cord);

        int[] result = new int[4];
        result[0]= a[4];
        result[1]= a[5];
        result[2]= a[6];
        result[3] = a[7];

        return result;
    }

}
