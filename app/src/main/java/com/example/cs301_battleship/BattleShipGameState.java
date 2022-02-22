package com.example.cs301_battleship;

public class BattleShipGameState {
    String playerID;
    Board playersBoard;
    boolean playersTurn;
    int timer;
    // 0 = setup | 1 = game phase | 2 = end phase
    int phase;
    int remainingShips;



    public BattleShipGameState(String playerID, Board playersBoard, boolean playersTurn, int timer, int phase, int remainingShips) {
        this.playerID = playerID;
        this.playersBoard = playersBoard;
        this.playersTurn = playersTurn;
        this.timer = timer;
        this.phase = phase;
        this.remainingShips = remainingShips;
    }

    public BattleShipGameState(BattleShipGameState copy) {
        this.playerID = copy.playerID;
        this.playersBoard = copy.playersBoard;
        this.playersTurn = copy.playersTurn;
        this.timer = copy.timer;
        this.phase = copy.phase;
        this.remainingShips = copy.remainingShips;
    }

    @Override
    public String toString() {
        if (playersTurn == true) {
            return "It is " + playerID + "'s turn." + playerID + "has " + remainingShips + " remaining.";
        }
        return "It is not " + playerID + "'s turn.";
    }




}
