import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by Zoltán on 2016.12.07..
 */


public class Game extends JFrame {

    Board gameBoard = new Board();

    public Game() {

        new JFrame("RPG Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setJMenuBar();
        this.add(gameBoard);

        this.pack();
        this.setLocationRelativeTo(null);

        this.setVisible(true);


    }

    private void setJMenuBar() {

        JMenuBar menubar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem newgameMenuItem = new JMenuItem("New game");
        newgameMenuItem.setMnemonic(KeyEvent.VK_E);
        newgameMenuItem.setToolTipText("Starts a new game");
        newgameMenuItem.addActionListener(new NewGameAction());
        fileMenu.add(newgameMenuItem);

        JMenuItem savegameMenuItem = new JMenuItem("Save");
        savegameMenuItem.setMnemonic(KeyEvent.VK_E);
        savegameMenuItem.setToolTipText("Saves the game");
        savegameMenuItem.addActionListener(new SaveGameAction());
        fileMenu.add(savegameMenuItem);

        JMenuItem loadGameMenuItem = new JMenuItem("Load");
        loadGameMenuItem.setMnemonic(KeyEvent.VK_E);
        loadGameMenuItem.setToolTipText("Loads a saved game");
        loadGameMenuItem.addActionListener(new LoadGameAction());
        fileMenu.add(loadGameMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.setToolTipText("Exit application");
        exitMenuItem.addActionListener(new ExitAction());
        fileMenu.add(exitMenuItem);

        menubar.add(fileMenu);
        setJMenuBar(menubar);

    }
    private class ExitAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    private class NewGameAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
           reset();

        }
    }
    private class SaveGameAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            save();
        }
    }
    private class LoadGameAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            load();
        }
    }

    private void reset(){
        gameBoard.setGameStatus(true);
        gameBoard.setMapLevel(1);
        gameBoard.setGameWin(false);
        gameBoard.setMainHero(new Hero("images/hero-down.png",0,0));
        gameBoard.setCurrentMap(new Map(1));
        gameBoard.repaint();
    }
    private void save(){
        gameBoard.savingGame();
    }
    private void load(){
        gameBoard.loadingGame();
        gameBoard.repaint();
    }




}
