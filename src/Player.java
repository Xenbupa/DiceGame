public class Player {
    private static int playGamesNum;
    private static int wonGamesNum;
public Player(){
playGamesNum = 0;
wonGamesNum = 0;
}

public void addNumOfGames(boolean hasWon){
    if (hasWon) {
        wonGamesNum++;
    }
    playGamesNum++;
}
    public static int getPlayGamesNum() {
        return playGamesNum;
    }

    public static int getWonGamesNum() {
        return wonGamesNum;
    }
}
