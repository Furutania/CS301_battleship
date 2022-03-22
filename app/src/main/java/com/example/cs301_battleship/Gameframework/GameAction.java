package com.example.cs301_battleship.Gameframework;

import com.example.cs301_battleship.GamePlayer;

public abstract class GameAction {

    private GamePlayer player;

    /**
     * constructor for GameAction
     *
     * @param player
     * 		the player who created the action
     */
    public GameAction(GamePlayer player) {
        this.player = player;
    }

    /**
     * tells the player who created the action
     *
     * @return the player who created the action
     *
     */
    public GamePlayer getPlayer() {
        return player;
    }

    /** Resets the source of the action. The intent is that it be used only
     *  by ProxyGame and ProxyPlayer.
     *
     * @param p
     * 		the new player to which the action is to be associated
     */
    public void setPlayer(GamePlayer p) {
        this.player = p;
    }

}