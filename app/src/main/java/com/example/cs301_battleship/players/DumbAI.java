package com.example.cs301_battleship.players;

import android.util.Log;

import com.example.cs301_battleship.BattleShipGameState;

import java.util.Random;

public class DumbAI extends GameComputerPlayer {

    public DumbAI() {
        super();
    }

    @Override
    protected void receiveInfo(BattleShipGameState info) {

        Random r = new Random();
        int row = r.nextInt(10) + 1;
        int col = r.nextInt(10) + 1;

        info.printFire(row, col, true);
        Log.i("randomFire", "Fired at " + row + " " + col + "." );
    //bruh

    }

}
