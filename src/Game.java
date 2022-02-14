public class Game {
    private Dice dice1;
    private Dice dice2;

    public Game(Dice dice1, Dice dice2) {
        dice1.throwDice();
        dice2.throwDice();
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public boolean hasWon() {
        int result = dice1.getValue() + dice2.getValue();
        return result == 7;
    }

    public Dice getDice1() {
        return dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public boolean dice1EqualsToFive() {
        return dice1.getValue() == 5;
    }

    public String printResult() {
        String text = "";
        text += ("El primer dau es: " + getDice1().getValue());
        text += ("\n El segon dau es: " + getDice2().getValue());
        text += ("\n Els deus obtinguts son: " + (getDice1().getValue() + " y " + getDice2().getValue()));
        if (hasWon()) {
            text += "Has guanyat Trampos!!!!! ;P";
        } else {
            text += "Has perdut!!!!! ";
        }
        return text;
    }

}
