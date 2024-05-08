package Player;

import java.util.HashMap;
import java.util.Scanner;

public class Player {
    
    public Integer numberOfPlayers;
    public HashMap<String, Integer> players;

    public Player() {
        this.numberOfPlayers = 0;
        this.players = new HashMap<String, Integer>();
    }

    @SuppressWarnings("resource")
    public void addPlayers() {
        System.out.println();
        System.out.println();
        Scanner command = new Scanner(System.in);
        this.numberOfPlayers = Integer.parseInt(command.nextLine());
        for (int i = 0; i < this.numberOfPlayers; i++) {
            this.players.put(command.nextLine(), 0);
        }
    }
}