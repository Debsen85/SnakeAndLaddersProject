package Ladder;

import java.util.HashMap;
import java.util.Scanner;

public class Ladder {

    public Integer numberOfLadders;
    public HashMap<Integer, Integer> ladders;

    public Ladder() {
        this.numberOfLadders = 0;
        this.ladders = new HashMap<Integer, Integer>();
    }

    @SuppressWarnings("resource")
    public void addLadders() {
        System.out.println();
        System.out.println();
        Scanner command = new Scanner(System.in);
        this.numberOfLadders = Integer.parseInt(command.nextLine());
        for (int i = 0; i < this.numberOfLadders; i++) {
            String tokens[] = command.nextLine().split(" ");
            this.ladders.put(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
    }
}