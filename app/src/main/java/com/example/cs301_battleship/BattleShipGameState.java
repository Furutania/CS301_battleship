package com.example.cs301_battleship;

public class BattleShipGameState {
    private String playerID;
    private board playersBoard;
    private boolean playersTurn;
    private int timer;
    // 0 = setup | 1 = game phase | 2 = end phase
    private int phase;
    private int remainingShips;


    // basic constructor
    public BattleShipGameState(String playerID, board playersBoard, boolean playersTurn, int timer, int phase, int remainingShips) {
        this.playerID = playerID;
        this.playersBoard = playersBoard;
        this.playersTurn = playersTurn;
        this.timer = timer;
        this.phase = phase;
        this.remainingShips = remainingShips;
    }

    // deep copy constructor
    public BattleShipGameState(BattleShipGameState copy) {
        this.playerID = copy.playerID;
        this.playersBoard = new board(copy.playersBoard);
        this.playersTurn = copy.playersTurn;
        this.timer = copy.timer;
        this.phase = copy.phase;
        this.remainingShips = copy.remainingShips;
    }

    // if true, then player can fire. if false, then player can't fire
    public boolean canFire(int row, int col) {
        boolean isHit = playersBoard.getCoordHit(row, col);
        if (isHit == true) {
            return false;
        }
        return true;
    }

    @Override
    // returns the number of ships remaining for the player if it is their turn or returns that it is not their turn
    public String toString() {
        if (playersTurn == true) {
            return "It is " + playerID + "'s turn." + playerID + "has " + remainingShips + " remaining.";
        }
        return "It is not " + playerID + "'s turn.";
    }




}
