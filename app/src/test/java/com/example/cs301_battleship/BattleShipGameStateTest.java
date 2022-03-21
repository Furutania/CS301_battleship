package com.example.cs301_battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class BattleShipGameStateTest {

    @Test
    public void canFire() {
        BattleShipGameState gameState = new BattleShipGameState();
        Coordinates coord = new Coordinates(false, true, 4, 5);

        boolean fire = gameState.canFire(coord);
        assertTrue(fire);

    }

    @Test
    public void placeShip() {
        BattleShipGameState gameState = new BattleShipGameState();

        Coordinates[][] board = new Coordinates[10][10]; //Creating a 10 x 10 grid
        for (int i = 0; i < 10; i++)  {
            for(int j = 0; j < 10; j++){
                board[i][j] = new Coordinates(false, false, i + 1, j + 1);
            }
        }
        Coordinates[] coords = new Coordinates[5];
        for(int i = 0; i < 5; i++) {
            coords[i] = new Coordinates(board[4 + i][5]);//creates a list of coords for a battle ship object to hold
            coords[i].setX(5 + i);
            coords[i].setY(5);
        }
        BattleshipObj battleship = new BattleshipObj(5, coords);

        BattleshipObj[] fleet1 = {battleship,battleship,battleship,battleship,battleship,battleship};
        BattleshipObj[] fleet2 = {battleship,battleship,battleship,battleship,battleship,battleship};
        gameState.setPlayersFleet(fleet1, fleet2);

        boolean place = gameState.placeShip(battleship, coords);
        assertTrue(place);
    }

    @Test
    public void checkIfCoordHit() {
        BattleShipGameState gameState = new BattleShipGameState();
        Coordinates coord = new Coordinates(false, false, 4, 5);

        boolean fire = gameState.canFire(coord);
        GameBoard playersBoard = gameState.getBoard();
        boolean hitCoord = playersBoard.getCoordHit(4, 5);
        assertTrue(fire);
        assertTrue(hitCoord);
    }

    @Test
    public void printFire() {
    }

    @Test
    public void printPlaceShip() {
    }

    @Test
    public void setPlayersFleet() {
    }

    @Test
    public void testToString() {
    }
}