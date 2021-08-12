import java.util.*;
public class State {
    Board board;
    int visitCount;
    int player;
    boolean gameOver;

    /**
     * Default Constructor for empty board
     * @param player    player 1 or 2
     */
    public State(int player){
        this.board = new Board();
        this.visitCount = 0;
        this.player = player;
        this.gameOver = false;
    }

    /**
     * Constructor
     * @param board         current board state
     * @param visitCount    how many times the node has been visited
     * @param player        which player is playing
     * @param gameOver      boolean representing if the game is finished
     */

     public State(Board board, int visitCount, int player){
         this.board = board;
         this.visitCount = visitCount;
         this.player = player;
         this.gameOver = isGameOver();
     }

     public boolean isGameOver(){
         return this.board.isGameOver();
     }

     public List<State> allPossiblePlays(){
        List<State> possiblePlays = new ArrayList<>();
        
        return possiblePlays;
     }
}
