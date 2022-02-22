package com.example.cs301_battleship;

public class board extends coordinates {
    private coordinates currentBoard[][] = new coordinates[10][10];

    public board(){
        int i,j;
        for (i = 1; i <= 10; i++){
            for(j = 1; i <= 10; j++){
                this.currentBoard[i][j] = new coordinates(false, false);
            }
        }
    }

    public board(board orig){ //copy constructor
        int i,j;
        for (i = 1; i <= 10; i++){
            for(j = 1; i <= 10; j++){
                this.currentBoard[i][j] = new coordinates(orig.currentBoard[i][j]);
            }
        }
    }


 public board(int row, int col, boolean hit){
        boolean wasHit = this.currentBoard[row][col].setHit(hit);

 }


}
