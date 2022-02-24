package com.example.cs301_battleship;

/**
 * coordinates - A representation of the coordinates on a Battleship board.
 *
 * @author Austen Furutani
 * @author Keoni Han
 * @author Steven Lee
 * @author Tyler Santos
 * @version Spring 2022 - 2/22/22
 */
public class coordinates {
    private boolean hit;
    private boolean hasShip;

    /**
     * creates a coordinate object setting its instance variables
     * @param hit
     * @param hasShip
     */
    public coordinates(boolean hit, boolean hasShip){
        this.hit = hit;
        this.hasShip = hasShip;
    }

    /**
     * default constructor for coordinate sets hit and hasShip to false
     */
    public coordinates(){ //default constructor
        this.hit = false;
        this.hasShip = false;
    }

    /**
     * Copy contructor, creates a copy of the passed in coordinate object
     * @param orig
     */
    public coordinates(coordinates orig){
        this.hit = orig.hit;
        this.hasShip = orig.hasShip;
    }

    /**
     * Changes the boolean of hit to the passed in value, then returns
     * if the coordinate hit has a ship on it
     * @param hit
     * @return
     */
    public boolean setHit(boolean hit){
        this.hit = hit;
        return this.hasShip;
    }

    /**
     * returns a boolean, if the coordinate has already been hit.
     * @return bool of hit
     */
    public boolean getHit() {
        return this.hit;
    }


}
