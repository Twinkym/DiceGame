import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        while (askToplayer()) {
            Game game = new Game(new Dice(), new Dice());
            jugador.addGame(game);
            showValues(game);
            showPlayerStatics(jugador);
        }
    }

    private static void showPlayerStatics(Jugador jugador) {
        System.out.println("Partides guanyades: " + jugador.countGamesWon());
        System.out.println("Partides jugades: " + jugador.countGamesPlayed());
    }

    private static void showValues(Game game) {
        System.out.println(game.printResult());
    }

    private static boolean askToplayer() {
        System.out.println("Vols llençar els daus? S/N: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("s");
    }
}

