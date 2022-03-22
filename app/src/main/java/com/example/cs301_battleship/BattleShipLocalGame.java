package com.example.cs301_battleship;

import com.example.cs301_battleship.Gameframework.GameAction;
import com.example.cs301_battleship.Gameframework.LocalGame;
import com.example.cs301_battleship.players.GamePlayer;

public class BattleShipLocalGame extends LocalGame {

    public BattleShipLocalGame(){
        super();
        super.state = new BattleShipGameState();
    }

    public  BattleShipLocalGame(BattleShipGameState orig){
        super();
        super.state = new BattleShipGameState(orig);
    }

    @Override
    public void start(GamePlayer[] players){
        super.start(players);
    }

    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        p.sendInfo(new BattleShipGameState((BattleShipGameState) state));
    }

    @Override
    protected boolean canMove(int playerIdx) {
        return playerIdx == ((BattleShipGameState) state).getPlayersTurn();
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    public int whoWon(){
        return 1;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}
