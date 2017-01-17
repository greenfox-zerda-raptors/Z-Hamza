/**
 * Created by Zoltán on 2017.01.17..
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        GameOfLife gameOfLife = new GameOfLife(3,3);

        gameOfLife.changeCellinXY(1,0);
        gameOfLife.changeCellinXY(1,1);
        gameOfLife.changeCellinXY(1,2);
//        gameOfLife.populateRandomly();

        System.out.println(gameOfLife.toString());
        for( int i = 0; i < 100; i ++){
            System.out.println("This is the " + (i + 2) + "th generation");
            gameOfLife.nextGeneration();
            System.out.println(gameOfLife.toString());
           Thread.sleep(2000);
        }
        System.out.println("Result");
        System.out.println(gameOfLife.toString());

    }
}
