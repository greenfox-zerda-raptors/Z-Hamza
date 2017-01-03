
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
        if (playerName == player1Name)
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {

        if (playersScoresEqual()) {
            return scoreforTie();
        }
        else if (someoneHasMoreThanForthy()) {
            return  checkAdvantageOrWin();
        }
        else {
            return getGeneralScore();
        }
    }

    private String scoreforTie() {
        String score;
        if(player1Score < 3) {
            score = writeoutScore(player1Score) + "-All";
        }
        else{
            score = "Deuce";
        }
        return score;
    }

    private String getGeneralScore() {
        return writeoutScore(player1Score)+ "-" + writeoutScore(player2Score);
    }

    private String checkAdvantageOrWin() {
        int scoreDifference = player1Score - player2Score;
        if(Math.abs(scoreDifference) == 1){
            return "Advantage " + winnerName(scoreDifference);
        }
        else {
            return  "Win for " + winnerName(scoreDifference);
        }
    }

    private String winnerName(int scoreDifference){
        if(scoreDifference > 0) {
            return player1Name;
        }
        else{
            return player2Name;
        }
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
        return (player1Score >=4 || player2Score >=4);
    }

}

