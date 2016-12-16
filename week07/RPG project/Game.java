import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by Zoltán on 2016.12.07..
 */


public class Game extends JFrame {

    Board gameBoard = new Board();
    private String fileName01 = "savedGame01.txt";
    private String fileName02 = "savedGame02.txt";
    private String fileName03 = "savedGame03.txt";

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

        JMenu savegameMenu = new JMenu("Save");
        savegameMenu.setMnemonic(KeyEvent.VK_E);
        savegameMenu.setToolTipText("Saves the game");
        fileMenu.add(savegameMenu);

        JMenuItem saveGame01 = new JMenuItem("Save 1");
        saveGame01.setMnemonic(KeyEvent.VK_E);
        saveGame01.setToolTipText("Saving game to 1");
        saveGame01.addActionListener(new SaveGameAction(fileName01));
        savegameMenu.add(saveGame01);

        JMenuItem saveGame02 = new JMenuItem("Save 2");
        saveGame02.setMnemonic(KeyEvent.VK_E);
        saveGame02.setToolTipText("Saving game to 2");
        saveGame02.addActionListener(new SaveGameAction(fileName02));
        savegameMenu.add(saveGame02);

        JMenuItem saveGame03 = new JMenuItem("Save 3");
        saveGame03.setMnemonic(KeyEvent.VK_E);
        saveGame03.setToolTipText("Saving game to 3");
        saveGame03.addActionListener(new SaveGameAction(fileName03));
        savegameMenu.add(saveGame03);


        JMenu loadGameMenu = new JMenu("Load");
        loadGameMenu.setMnemonic(KeyEvent.VK_E);
        loadGameMenu.setToolTipText("Loads a saved game");
        fileMenu.add(loadGameMenu);

        JMenuItem loadGame01 = new JMenuItem("Load 1");
        loadGame01.setMnemonic(KeyEvent.VK_E);
        loadGame01.setToolTipText("Loading game to 1");
        loadGame01.addActionListener(new LoadGameAction(fileName01));
        loadGameMenu.add(loadGame01);

        JMenuItem loadGame02 = new JMenuItem("Load 2");
        loadGame02.setMnemonic(KeyEvent.VK_E);
        loadGame02.setToolTipText("Loading game to 2");
        loadGame02.addActionListener(new LoadGameAction(fileName02));
        loadGameMenu.add(loadGame02);

        JMenuItem loadGame03 = new JMenuItem("Load 3");
        loadGame03.setMnemonic(KeyEvent.VK_E);
        loadGame03.setToolTipText("Loading game to 3");
        loadGame03.addActionListener(new LoadGameAction(fileName03));
        loadGameMenu.add(loadGame03);

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
        private String fileName;

        public SaveGameAction(String fileName){
            this.fileName = fileName;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            save(fileName);
        }
    }

    private class LoadGameAction implements ActionListener {
        private String fileName;
        public LoadGameAction(String fileName){
            this.fileName = fileName;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            load(fileName);
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
    private void save(String fileName){
        gameBoard.savingGame(fileName);
    }
    private void load(String fileName){
        gameBoard.loadingGame(fileName);
        gameBoard.repaint();
    }




}
