
public class TennisGame3 implements TennisGame {

    private int player1Point;
    private int player2Point;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1, String player2) {
        this.player1Name = player1;
        this.player2Name = player2;
    }

    public String getScore() {
        String score;
        if (player1Point < 4 && player2Point < 4 && !(player1Point + player2Point == 6)) {
            String[] pointNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = pointNames[player1Point];
            return (player1Point == player2Point) ? score + "-All" : score + "-" + pointNames[player2Point];
        } else {
            if (player1Point == player2Point)
                return "Deuce";
            score = player1Point > player2Point ? player1Name : player2Name;
            return ((player1Point - player2Point)*(player1Point - player2Point) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            this.player1Point ++;
        else
            this.player2Point ++;
        
    }

}
