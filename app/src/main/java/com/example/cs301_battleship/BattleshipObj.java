package com.example.cs301_battleship;

import android.util.Log;

/**
 * BattleshipObj
 * Creates a battleship object, storing its location, its size, and if its been sunk
 *
 * @author Austen Furutani
 * @author Keoni Han
 * @author Steven Lee
 * @author Tyler Santos
 * @version Spring 2022 - 2/22/22
 */
//hi
public class BattleshipObj {
    private int size;
    private boolean sunk;
    private Coordinates[] location = new Coordinates[size];

    /**
     * Creates a battleShip Obj and sets the size and location
     * @param size
     * @param location
     */
    public BattleshipObj(int size, Coordinates[] location){
        this.size = size;
        this.sunk = false;
        int i;
        for(i = 0; i < location.length; i++){
            this.location[i] = new Coordinates(location[i]);
        }
    }

    /**
     * Creates a copy of the Battleship Obj
     * @param orig
     */
    public BattleshipObj(BattleshipObj orig){
        this.size = orig.size;
        this.sunk = orig.sunk;
        int i;
        for(i = 0; i < location.length; i++){
            this.location[i] = new Coordinates(orig.location[i]);
        }
    }

    /**
     * checks if all the coodinates of the ship has been hit,
     * If it is than sets the to sunk and returns true
     * @param ship
     * @return boolean
     */
    public boolean checkIfSunk(BattleshipObj ship){
        int i;
        for(i = 0; i < location.length; i++){
            if(ship.location[i].getHit() == false){
                return false;
            }
        }
        //ship sunk
        setSunk(true);
        return true;
    }


    /**
     * getters and setters
     * @return
     */
    public int getSize() {
        return size;
    }
    public boolean getSunk() {
        return sunk;
    }
    public Coordinates[] getLocation() {
        return location;
    }

    public void setSize(int size){
        this.size = size;
    }
    public void setSunk(boolean sunk){
        this.sunk = sunk;
    }
    public void setLocation(Coordinates[] location) {
        this.location = location;
    }
}
