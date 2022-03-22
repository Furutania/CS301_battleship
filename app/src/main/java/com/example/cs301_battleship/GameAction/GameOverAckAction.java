package com.example.cs301_battleship.GameAction;

import com.example.cs301_battleship.players.GamePlayer;
import com.example.cs301_battleship.Gameframework.GameAction;

/**
 * An action by which the player acknowledges that the game is over.
 *
 * @author Steven R. Vegdahl
 * @version July 2013
 */
public class GameOverAckAction extends GameAction {
    //Tag for logging
    private static final String TAG = "GameOverAckAction";
    // to satisfy the Serializable interface
    private static final long serialVersionUID = 4096230060363451102L;

    /**
     * constructor
     *
     * @param p
     * 		the player to sent the action
     */
    public GameOverAckAction(GamePlayer p) {
        super(p);
    }
}