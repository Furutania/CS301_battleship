package com.example.cs301_battleship.Gameframework;

import com.example.cs301_battleship.GamePlayer;

public interface Game {

    /**
     * starts the game
     *
     * @param players
     * 			the players who are in the game
     */
    public abstract void start(GamePlayer[] players);

    /**
     * sends the given action to the Game object.
     *
     * @param action
     *            the action to send
     */
    public abstract void sendAction(GameAction action);

}
