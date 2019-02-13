class Board{
    char[][] positions = new char[6][7]; // Represents pieces on the board
    int moves = 0; // Counts number of moves played
    int lastMove = 0; // Keeps track of the last move played

    /**
    * Converts the board into a user friendly string
    *
    * @return   The board represented as a string
    */
    public String toString(){
        //{{1...7}, {1...7}, {1...7}, {1...7}, {1...7}, {1...7}}
        for(int i = 0 ; i < 6 ; i++){
            System.out.print("| ");
            for(int j = 0 ; j < 7 ; j++){
                if(positions[i][j]==0){
                    System.out.print("  | ");
                }else{
                    System.out.print(positions[i][j]+" | ");
                }
            }
            System.out.print("\n");
        }
        return null;
    }


    /**
    * Checks to see if a piece can be played in a given column
    *
    * @param  col   The column being checked
    * @return   Whether or not the piece can be placed there
    */
    public boolean isColPlayable(int col){
        return true;
    }

    /**
    * Plays a piece in the given column
    *
    * @param  c    The person placing the piece ('X' or 'O')
    * @param  col   The column being played
    */
    public void playPiece(char c,int col){
       return;
    }

    /**
    * Checks to see if a player has won the game
    *
    * @param  c     The person who may or may not have won
    * @return   Whether or not they have won
    */
    public boolean checkWin(char c){
        return false;
    }

    /**
    * Assigns a score to the current state of the board for use in minimax
    *
    * @return   The score of the board
    */
    public int scoreBoard(){
        return 0;
    }

    /**
    * Tells us whether or not the game is a draw 
    *
    * @return   Whether or not the game is a draw 
    */
    public boolean isDraw(){
        return false;
    }
}

/* 

Example Board

  1   2   3   4   5   6   7
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+
|   | X | O |   |   |   |   |
+---+---+---+---+---+---+---+
| X | O | X |   |   |   |   |
+---+---+---+---+---+---+---+

*/
