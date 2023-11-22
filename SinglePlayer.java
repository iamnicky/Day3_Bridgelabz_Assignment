import java.util.ArrayList;

public class SinglePlayer {
    private static int checkSnakeAndLadder(int position) {
        // snakes and ladders {startBox, endBox} positions
        SnakeLadderBoard[] snakesAndLadders = {
                new SnakeLadderBoard(16, 6),
                new SnakeLadderBoard(47, 26),
                new SnakeLadderBoard(49, 11),
                new SnakeLadderBoard(56, 53),
                new SnakeLadderBoard(62, 19),
                new SnakeLadderBoard(64, 60),
                new SnakeLadderBoard(87, 24),
                new SnakeLadderBoard(93, 73),
                new SnakeLadderBoard(95, 75),
                new SnakeLadderBoard(98, 78)
        };

        for (SnakeLadderBoard snakeOrLadder : snakesAndLadders) {
            if (position == snakeOrLadder.getSnakePos()) {
                System.out.println("OH SHIT!  you met a snake: go back to the box- " + snakeOrLadder.getLadderPos());
                return snakeOrLadder.getLadderPos();
            } else if (position == snakeOrLadder.getLadderPos()) {
                System.out.println("HURRAY! you met a ladder: climb to the box- " + snakeOrLadder.getSnakePos());
                return snakeOrLadder.getSnakePos();
            } else {
                System.out.println("HURRY UP! no snakes and ladder found");
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int currentPosition = 0;
        int finalPosition = 100;
        System.out.println("Welcome to the Game");

        while (currentPosition < finalPosition) {
            int dieRolled = Die.roll();
            //player movement
            currentPosition += dieRolled;

            currentPosition = checkSnakeAndLadder(currentPosition);
            //after rolling dic what we got and the current position
            System.out.println("Die Rolled we got: " + dieRolled + "Current Position: " + currentPosition);

        }
        System.out.println("Congratulations! You reached the final square.");
    }
}
