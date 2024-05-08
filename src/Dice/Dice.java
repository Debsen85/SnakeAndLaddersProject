package Dice;

public class Dice {

    public Integer diceSize;
    public Integer[] dice;

    public Dice(Integer diceSize) {
        this.diceSize = diceSize;
        this.dice = new Integer[this.diceSize];
        for (int i = 0; i < diceSize; i++) {
            dice[i] = i + 1;
        }
    }

    public Integer rollDice() {
        return dice[(int) (Math.random() * dice.length)];
    }
}
