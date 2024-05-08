import Dice.Dice;
import Ladder.Ladder;
import Player.Player;
import Snake.Snake;

public class SnakeAndLadders {

    Integer winningGoal;

    public SnakeAndLadders(Integer winningGoal) {
        this.winningGoal = winningGoal;
    }
    public static void main(String[] args) throws Exception {
        new SnakeAndLadders(100);
        Dice dice = new Dice(6);
        Ladder ladder = new Ladder();
        Player player = new Player();
        Snake snake = new Snake();

        snake.addSnakes();
        ladder.addLadders();
        player.addPlayers();

        Boolean flag = true;
        String winner = "";

        System.out.println();
        System.out.println();

        while (flag) {
            for (String key : player.players.keySet()) {
                Integer value = player.players.get(key);
                Integer diceValue = dice.rollDice();
                Integer finalValue = value + diceValue;

                if (finalValue > 100) {
                    player.players.put(key, value);
                    finalValue = value;
                } 
                else if (finalValue == 100) {
                    player.players.put(key, value);
                    winner = key;
                    System.out.println(key + " rolled a " + diceValue + " and moved from " + value + " to " + finalValue);
                    flag = false;
                    break;
                } 
                else {
                    if (snake.snakes.containsKey(finalValue)) {
                        player.players.put(key, snake.snakes.get(finalValue));
                        finalValue = snake.snakes.get(finalValue);
                    } 
                    else if (ladder.ladders.containsKey(finalValue)) {
                        player.players.put(key, ladder.ladders.get(finalValue));
                        finalValue = ladder.ladders.get(finalValue);
                        if (finalValue == 100) {
                            winner = key;
                            System.out.println(key + " rolled a " + diceValue + " and moved from " + value + " to " + finalValue);
                            flag = false;
                            break;
                        }
                    } 
                    else {
                        player.players.put(key, finalValue);
                    }
                }
                System.out.println(key + " rolled a " + diceValue + " and moved from " + value + " to " + finalValue);
            }
        }
        System.out.println(winner + " wins the game.");
    }
}