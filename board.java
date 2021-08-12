/**
 * Oliver's version of a board object
 */

 // Notes: Unsure whether to put play turn function in Board.java or State.java, will decide tommorow
 
public class Board {
    public static final int X = 1;
    public static final int O = 2;

    //instance variables
    int[] board;
    boolean gameOver;
    int colSize;
    int rowSize;
    char winner;

    /**
     * Default Board Constructer
     */
    public Board(){
        this.colSize = 3;
        this.rowSize = 3;
        for(int i = 0; i < colSize*rowSize; i++){
            board[i] = 0;
        }
        this.gameOver = false;
        this.winner = 0;
    }

    /**
     * Constructor for custom height and width
     */
    public Board(int x, int y){
        this.colSize = x;
        this.rowSize = y;
        for(int i = 0; i < colSize*rowSize; i++){
            board[i] = 0;
        }
        this.gameOver = false;
        this.winner = 0;
    }

    /**
     * @return      returns a copy of the current Board
     */
    public Board copy(){
        Board copyOfBoard = new Board();
        for(int i = 0; i < this.rowSize * this.colSize; i++){
            copyOfBoard.board[i] = this.board[i];
        }
        copyOfBoard.gameOver = this.gameOver;
        copyOfBoard.colSize = this.colSize;
        copyOfBoard.rowSize = this.rowSize;
        copyOfBoard.gameOver = this.gameOver;
        copyOfBoard.winner = winner;
        return copyOfBoard;
    }

    public int index(int x, int y){
        return (this.colSize * y + x);
    }

    public void checkGameOver(){
        //Condition 1: Diagonals
        if(board[0]!=0 && board[0] == board[4] && board[4] == board[8]){
            this.gameOver = true;
            if(board[0] == 1){
                this.winner = 'X';
            }
            else{
                this.winner = 'O';
            }
        }
        if(board[2]!=0 && board[2] == board[4] && board[4] == board[6]){
            this.gameOver = true;
            if(board[0] == 1){
                this.winner = 'X';
            }
            else{
                this.winner = 'O';
            }
        }

        int first;
        int second;
        int third;
        //vertical win
        for(int x=0; x<3; x++){
            first = board[index(x,0)];
            second = board[index(x,1)];
            third = board[index(x,2)];
            if(first != 0 && first == second && second == third){
                if(first == 1){
                    this.winner = 'X';
                }
                else{
                    this.winner = 'O';
                }
                this.gameOver = true;
            }
        }

        //horizontal win
        for(int y=0; y<3; y++){
            first = board[index(0,y)];
            second = board[index(1,y)];
            third = board[index(2,y)];
            if(first != 0 && first == second && second == third){
                if(first == 1){
                    this.winner = 'X';
                }
                else{
                    this.winner = 'O';
                }
                this.gameOver = true;
            }
        }


    }
    /**
     * returns a boolean representing if the game is over or not
     */
    public boolean isGameOver(){
        return this.gameOver;
    }
}
