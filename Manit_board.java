// import java.io.*;

//ctrl / for the win cause /* for some reason didn't work

// class Board
// {
//     private final static int _ = 0;
//     private final static int O = 1;
//     private final static int X = 2;
    
//     private int[][] board;
//     private int bsize;
//     private boolean gameover;

//     public Board() {
//         // initialize board
//         for (int i = 0; i < bsize; i++) {
//             for (int j = 0; j < bsize; i++) {
//                 board[i][j] = _;
//             }
//         }
//         this.bsize = 3;
//         this.gameover = false;
//     }

//     /**
//      * Make a copy of the current board
//      * @return
//      */
//     public Board copy(){
//         Board newBoard = new Board();
//         for(int i=0; i<this.board.length; i++){
//             for(int j = 0; j < this.board[0].length; j++){
//                 newBoard.board[i][j] = this.board[i][j];
//             }
//         }
//         newBoard.bsize = this.bsize;
//         newBoard.gameOver = this.gameOver;
//     }

//     /** Inputs the turn onto the board. Returns 1 is successful
//       * char - the player whose turn it is
//       * x - the column on the board
//       * y - the row on the board
//     */
//     public boolean turn(int char, int x, int y) {
//         if (board[x][y] == _) {
//             board[x][y] = char;
//             return true;
//         }
//         return false;
//     }

//     public boolean isGameOver() {
//         int x = y = 0;
//         int first,second,third = 0;

//         // vertical wins
//         for (x = 0; x < 3; x++) {
//             first = board[x][0];
//             second = board[x][1];
//             third = board[x][2];

//             if (first == second && second == third) {
//                 gameover = true;
//                 return true;
//             }
//         }

//         // horizontal wins
//         for (y = 0; y < 3; y++) {
//             first = board[y][0];
//             second = board[y][1];
//             third = board[y][2];

//             if (first == second && second == third) {
//                 gameover = true;
//                 return true;
//             }
//         }

//         // diagonal wins
//         first = board[0][0];
//         second = board[1][1];
//         third = board[2][2];
//         if (first == second && second == third) {
//             gameover = true;
//             return true;
//         }

//         first = board[2][0];
//         second = board[1][1];
//         third = board[0][2];
//         if (first == second && second == third) {
//             gameover = true;
//             return true;
//         }
//         return false;
//     }


// }

// */