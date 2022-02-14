import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Player player = new Player();
        while (askIfWantsToThrowAgain()) {

            dice1.throwDice();
            dice2.throwDice();
            showDiceValue(dice1,dice2);
            player.addNumOfGames(hasWon(dice1,dice2));
            showPlayerStadistics(player);

        }
    }
    private static void showPlayerStadistics(Player player) {
        System.out.println("Num Partides: "+player.getPlayGamesNum());
        System.out.println("Num Victories: "+player.getWonGamesNum());
    }
    private static void showDiceValue(Dice dice1, Dice dice2) {
        System.out.println("El resultat del dau 1 és: " + dice1.getValue());
        System.out.println("El resultat del dau 2 és: " + dice2.getValue());

        System.out.println("El resultat total de la tirada dels daus és: " + (dice1.getValue() + dice2.getValue()));
        if (hasWon(dice1, dice2)) {
            System.out.println("Has guanyat la partida! :D");
        } else {
            System.out.println("Has perdut la partida :'(");

        }
    }


    private static boolean hasWon( Dice dice1, Dice dice2) {
        int result = dice1.getValue() + dice2.getValue();
        return result == 7;
    }

    private static boolean askIfWantsToThrowAgain() {
        System.out.println("Vols tirarels daus? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");
    }
}
