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

    public String[] writeStat(){

        String status;
        if(this.getCurrentHealthPoint() <= 0){
            status = "(dead)";
        }else {
            status = "(alive)";
        }

        String[] result = new String[]{
                this.getClass().getSimpleName() +"  "+ status,
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
            if(i == 0){graphics.setFont(new Font("Courier New", Font.BOLD, 16));}
            else{graphics.setFont(new Font("Courier New", Font.PLAIN, 12));}
            graphics.drawString(writeStat()[i], 750, 100 + place * 120 + 20*i);
        }
    }



    // - - - - - - The figth - - - - - - - -
    public void fight(Karakter attacker, Karakter defender) {

        int spAtt = attacker.getStrikePoint();
        int spDef = defender.getStrikePoint();
        int dpAtt = attacker.getDefensePoint();
        int dpDef = defender.getDefensePoint();
        int currentHPAtt = attacker.getCurrentHealthPoint();
        int currentHPDef = defender.getCurrentHealthPoint();
        int damageAtt;
        int damageDef;

        if(spAtt - dpDef > 0) {
            damageAtt = spAtt - dpDef;
        }else{
            damageAtt = 0;
        }
        if(spDef - dpAtt > 0) {
            damageDef = spDef - dpAtt;
        }else{
            damageDef = 0;
        }
        if(checkifDead(attacker) == false && checkifDead(defender) == false) {
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


    public boolean checkifDead(Karakter karakter){
        if(karakter.getCurrentHealthPoint() <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void winFight(Karakter karakter){
        gainHealth(karakter, 5);

    }

    public void gainHealth(Karakter karakter, int number){
        if(karakter.getCurrentHealthPoint() + number > karakter.getHealthPoint()){
            karakter.setCurrentHealthPoint(karakter.getHealthPoint());
        }else{
            karakter.setCurrentHealthPoint(karakter.getCurrentHealthPoint() + number);
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


}
