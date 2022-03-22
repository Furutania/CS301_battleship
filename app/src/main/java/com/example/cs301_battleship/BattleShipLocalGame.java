package com.example.cs301_battleship;

import com.example.cs301_battleship.Gameframework.GameAction;
import com.example.cs301_battleship.Gameframework.LocalGame;

public class BattleShipLocalGame extends LocalGame {
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}
