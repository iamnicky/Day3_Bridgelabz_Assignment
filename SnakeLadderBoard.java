public class SnakeLadderBoard {
    private int snakePos;
    private int ladderPos;


    public SnakeLadderBoard(int snakePos, int ladderPos) {
        this.snakePos = snakePos;
        this.ladderPos = ladderPos;
    }

    public int getSnakePos() {
        return snakePos;
    }

    public void setSnakePos(int snakePos) {
        this.snakePos = snakePos;
    }

    public int getLadderPos() {
        return ladderPos;
    }

    public void setLadderPos(int ladderPos) {
        this.ladderPos = ladderPos;
    }

}
