import java.awt.*;

/**
 * Created by Zoltán on 2016.12.05..
 */
public abstract class Karakter extends GameObject {
    boolean isMoveable;

    int characterLevel;
    int healthPoint;
    int defensePoint;
    int strikePoint;
    boolean isAlive = true;


    int currentHealthPoint;

    public Karakter(String filename, int posX, int posY, boolean isMoveable, int[] stats) {

        super(filename, posX, posY);
        this.healthPoint = stats[0];
        this.currentHealthPoint = healthPoint;
        this.defensePoint = stats[1];
        this.strikePoint = stats[2];


    }

    public Karakter(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.isMoveable = false;
    }

    public String[] writeStatt(){
        String[] result = new String[]{
                this.getClass().getSimpleName(),
                "",
                "HP: " + getCurrentHealthPoint() + " / " + getHealthPoint(),
                "SP: " + getStrikePoint(),
                "DP: " + getDefensePoint(),
        };
        return result;
    }
//    - - - - Graphics write out - - - - -
    public void writeOut(Graphics graphics, int place){
            for(int i = 0; i < 5; i++){
                graphics.drawString(writeStatt()[i], 750, 100 + place * 120 + 20*i);
            }
    }



// - - - - - - The figth - - - - - - - -
    public void attack(Karakter attacker, Karakter defender) {

        int spAtt = attacker.getStrikePoint();
        int spDef = defender.getStrikePoint();
        int dpAtt = attacker.getDefensePoint();
        int dpDef = defender.getDefensePoint();
        int currentHPAtt = attacker.getCurrentHealthPoint();
        int currentHPDef = defender.getCurrentHealthPoint();

        int damageAtt = spAtt - dpDef;
        int damageDef = spDef - dpAtt;

        attacker.setCurrentHealthPoint(currentHPAtt - damageDef);
        defender.setCurrentHealthPoint(currentHPDef - damageDef);

    }

//  - - - - - - - Getters and setters - - - -
    public boolean isMoveable() {
        return isMoveable;
    }

    public void setMoveable(boolean moveable) {
        isMoveable = moveable;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public void setStrikePoint(int strikePoint) {
        this.strikePoint = strikePoint;
    }

    public boolean isAlive() {
        return isAlive;
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
}
