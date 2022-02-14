import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private List<Game> gameList = new ArrayList<>();

    public Jugador() {
    }

    public void addGame(Game game) {
        this.gameList.add(game);
    }

    public int countGamesPlayed() {
        return gameList.size();
    }

    public int countGamesWon() {
        int gamesWon = 0;
        for (Game game : gameList
        ) {
            if (game.hasWon()) {
                gamesWon++;
            }
        }
        return gamesWon;
    }

    public int countDice1GamesEqualsTofive() {
        int gamesWon = 0;
        for (Game game : gameList) {
            if (game.dice1EqualsToFive()) {
                gamesWon++;
            }
        }
        return gamesWon;
    }

    public boolean hasThreeConsecutiveWins() {
        int consecutiveWins = 0;
        for (Game game : gameList) {
            if (game.hasWon()) {
                consecutiveWins++;
            } else consecutiveWins = 0;
            if (consecutiveWins == 3) return true;
        }
        return false;
    }
}
