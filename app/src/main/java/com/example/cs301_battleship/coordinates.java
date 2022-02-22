package com.example.cs301_battleship;

public class coordinates {
    private boolean hit;
    private boolean hasShip;

    public coordinates(boolean hit, boolean hasShip){
        this.hit = hit;
        this.hasShip = hasShip;
    }
    public coordinates(){ //default constructor
        this.hit = false;
        this.hasShip = false;
    }

    public coordinates(coordinates orig){ //copy constructor
        this.hit = orig.hit;
        this.hasShip = orig.hasShip;
    }

    public boolean setHit(boolean hit){
        this.hit = hit;
        return this.hasShip;
    }

    public boolean getHit() {
        return this.hit;
    }


}
