import java.awt.*;
import java.util.Random;

/**
 * Created by Zoltán on 2016.12.05..
 */
public abstract class GameCharacter extends GameObject  {
    boolean isMoveable;

    int characterLevel = 1;
    int healthPoint;
    int defensePoint;
    int strikePoint;
    boolean isAlive = true;


    int currentHealthPoint;


    public GameCharacter(String filename, int posX, int posY, boolean isMoveable, int[] stats) {

        super(filename, posX, posY);
        this.healthPoint = stats[0];
        this.currentHealthPoint = healthPoint;
        this.defensePoint = stats[1];
        this.strikePoint = stats[2];
    }
    public GameCharacter(String fileName, int[] stats){
        super(fileName, stats[0], stats[1]);
        this.characterLevel = stats[2];
        this.healthPoint = stats[4];
        this.currentHealthPoint = stats[5];
        this.strikePoint = stats[6];
        this.defensePoint = stats[7];
        if(stats[3] == 0){
            this.isAlive = false;
        }

    }

    public GameCharacter(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.isMoveable = false;
    }

    public String[] writeStat(){

        String status;
        if(this.getCurrentHealthPoint() <= 0){
            status = "(dead)";
        }else {
            status = "(alive)";
        }

        String[] result = new String[]{
                this.getClass().getSimpleName() +"  "+ status,
                "lvl: " + getCharacterLevel(),
                "HP: " + getCurrentHealthPoint() + " / " + getHealthPoint(),
                "SP: " + getStrikePoint(),
                "DP: " + getDefensePoint(),
        };
        return result;
    }
    //    - - - - Graphics write out - - - - -
    public void writeOut(Graphics graphics, int place){
        for(int i = 0; i < 5; i++){
            if(i == 0){graphics.setFont(new Font("Courier New", Font.BOLD, 16));}
            else{graphics.setFont(new Font("Courier New", Font.PLAIN, 12));}
            graphics.drawString(writeStat()[i], 750, 100 + place * 120 + 20*i);
        }
    }


    // - - - - - - The figth - - - - - - - -
    public void fight(GameCharacter attacker, GameCharacter defender) {

        Random rnd = new Random();
//        int defenderDice = rnd.nextInt(6)+1;
//        int attackedDice = rnd.nextInt(6)+1;
        int spAtt = attacker.getStrikePoint();
        int spDef = defender.getStrikePoint();
        int dpAtt = attacker.getDefensePoint();
        int dpDef = defender.getDefensePoint();
        int currentHPAtt = attacker.getCurrentHealthPoint();
        int currentHPDef = defender.getCurrentHealthPoint();
        int damageAtt;
        int damageDef;

        if(spAtt  - dpDef > 0) {
            damageAtt = spAtt - dpDef;
        }else{
            damageAtt = 0;
        }
        if(spDef - dpAtt > 0) {
            damageDef = spDef - dpAtt;
        }else{
            damageDef = 0;
        }
        if(!checkifDead(attacker) && !checkifDead(defender)) {
            defender.setCurrentHealthPoint(currentHPDef - damageAtt);
            attacker.setCurrentHealthPoint(currentHPAtt - damageDef);
            if(defender.getCurrentHealthPoint() <= 0) {
                winFight(attacker);
            }
        }
        if(checkifDead(attacker)) {
            attacker.setAlive(false);
        }
        if(checkifDead(defender)){
            defender.setAlive(false);
            defender.changeImage("images/skull.png");

        }
    }

    public int isAliveInt(){
        if(this.isAlive){
            return 1;
        } else {
            return 0;
        }
    }

    public boolean checkifDead(GameCharacter karakter){
        if(karakter.getCurrentHealthPoint() <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void winFight(GameCharacter karakter){
        gainHealth(karakter, 5);
        karakter.levelUP();

    }

    public void gainHealth(GameCharacter karakter, int number){
        if(karakter.getCurrentHealthPoint() + number > karakter.getHealthPoint()){
            karakter.setCurrentHealthPoint(karakter.getHealthPoint());
        }else{
            karakter.setCurrentHealthPoint(karakter.getCurrentHealthPoint() + number);
        }
    }

    public void levelUP(){

        this.setCharacterLevel(getCharacterLevel() +1 );
        Random rnd = new Random();
        int d6one = rnd.nextInt(6)+1;
        this.setDefensePoint(getDefensePoint() + d6one);
        int d6two = rnd.nextInt(6)+1;
        this.setHealthPoint(getHealthPoint() + d6two);
        int d6three = rnd.nextInt(6)+1;
        this.setStrikePoint(getStrikePoint() + d6three);
    }

    public void monsterLvLUp(int number){
        this.setCharacterLevel(getCharacterLevel() +number );
        Random rnd = new Random();
        for(int i = 0; i < number; i++) {
            int d6one = rnd.nextInt(6) + 3;
            this.setDefensePoint(getDefensePoint() + d6one);
            int d6two = rnd.nextInt(6) + 1;
            this.setHealthPoint(getHealthPoint() + d6two);
            this.setCurrentHealthPoint(getHealthPoint());
            int d6three = rnd.nextInt(6) + 3;
            this.setStrikePoint(getStrikePoint() + d6three);
        }
    }






    //  - - - - - - - Getters and setters - - - -

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

    public void setStrikePoint(int strikePoint) {
        this.strikePoint = strikePoint;
    }


}
