package com.example.cs301_battleship.players;

import android.util.Log;

import com.example.cs301_battleship.BattleShipGameState;
import com.example.cs301_battleship.Coordinates;
import com.example.cs301_battleship.GameAction.Fire;
import com.example.cs301_battleship.GameAction.PlaceShip;
import com.example.cs301_battleship.Gameframework.GameInfo;

import java.util.Random;

public class DumbAI extends GameComputerPlayer {

    public DumbAI() {
        super();
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        BattleShipGameState gameState = new BattleShipGameState((BattleShipGameState)info);
        Fire fire = new Fire(this);
        PlaceShip placeShip = new PlaceShip(this);
        Random r = new Random();
        int row = r.nextInt(10) + 1;
        int col = r.nextInt(10) + 1;

        if (playerNum == gameState.getPlayersTurn()) {
            Coordinates coord = new Coordinates(false, true, row, col);
        }

        gameState.printFire(row, col, true);
        Log.i("randomFire", "Fired at " + row + " " + col + "." );
        game.sendAction(fire);
    //bruh

    }

}
