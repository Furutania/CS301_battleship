package com.example.cs301_battleship.players;

import com.example.cs301_battleship.Gameframework.GameInfo;
import com.example.cs301_battleship.MainActivity;
import com.example.cs301_battleship.players.GamePlayer;

public class GameHumanPlayer implements GamePlayer {

    @Override
    public void gameSetAsGui(MainActivity activity) {

    }

    @Override
    public void setAsGui(MainActivity activity) {

    }

    @Override
    public void sendInfo(GameInfo info) {

    }

    @Override
    public void start() {

    }

    @Override
    public boolean requiresGui() {
        return false;
    }

    @Override
    public boolean supportsGui() {
        return false;
    }
}
