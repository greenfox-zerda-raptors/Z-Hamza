
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        if (playersScoresEqual())
        {
            if(player1Score < 3) {
                score = writeoutScore(player1Score) + "-All";
            }
            else{
                score = "Deuce";
            }
        }
        else if (someoneHasMoreThanForthy())
        {
            score = checkAdvantageOrWin();
        }
        else
        {
            score = getGeneralScore();
        }
        return score;
    }

    private String getGeneralScore() {
        return writeoutScore(player1Score)+ "-" + writeoutScore(player2Score);
    }

    private String checkAdvantageOrWin() {
        String score;
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) score ="Advantage player1";
        else if (scoreDifference ==-1) score ="Advantage player2";
        else if (scoreDifference >=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private boolean playersScoresEqual() {
        return player1Score == player2Score;
    }

    public String writeoutScore(int score){
        String result = "";
        switch(score)
        {
            case 0:
                result="Love";
                break;
            case 1:
                result="Fifteen";
                break;
            case 2:
                result="Thirty";
                break;
            case 3:
                result="Forty";
                break;
        }
        return result;
    }
    public Boolean someoneHasMoreThanForthy(){
        if(player1Score >=4 || player2Score >=4){
            return true;
        }else {
            return false;
        }
    }
}

