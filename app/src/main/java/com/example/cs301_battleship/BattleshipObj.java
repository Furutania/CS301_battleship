package com.example.cs301_battleship;

import android.util.Log;

public class BattleshipObj {
    private int size;
    private boolean sunk;
    private Coordinates[] location = new Coordinates[size];

    public BattleshipObj(int size, Coordinates[] location){
        this.size = size;
        this.sunk = false;


        int i;
        for(i = 0; i < location.length; i++){
            this.location[i] = new Coordinates(location[i]);
        }
    }

    public BattleshipObj(BattleshipObj orig){
        this.size = orig.size;
        this.sunk = orig.sunk;


        int i;
        for(i = 0; i < location.length; i++){
            this.location[i] = new Coordinates(orig.location[i]);
        }
    }

    public boolean checkIfSunk(BattleshipObj ship){
        int i;
        for(i = 0; i < location.length; i++){
            if(ship.location[i].getHit() == false){
                return false;
            }
        }
        //ship sunk
        return true;
    }
}
