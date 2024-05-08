package Snake;

import java.util.HashMap;
import java.util.Scanner;

public class Snake {

    public Integer numberOfSnakes;
    public HashMap<Integer, Integer> snakes;

    public Snake() {
        this.numberOfSnakes = 0;
        this.snakes = new HashMap<Integer, Integer>();
    }

    @SuppressWarnings("resource")
    public void addSnakes() {
        System.out.println();
        System.out.println();
        System.out.println("<--------Snake and Ladders-------->");
        System.out.println();
        System.out.println();
        Scanner command = new Scanner(System.in);
        this.numberOfSnakes = Integer.parseInt(command.nextLine());
        for (int i = 0; i < this.numberOfSnakes; i++) {
            String tokens[] = command.nextLine().split(" ");
            this.snakes.put(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
    }
}