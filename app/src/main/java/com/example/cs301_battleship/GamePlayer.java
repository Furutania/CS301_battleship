package com.example.cs301_battleship;

public interface GamePlayer {
    // sets this player as the GUI player (implemented as final in the
    // major player classes)
    public abstract void gameSetAsGui(MainActivity activity);

    // sets this player as the GUI player (overrideable)
    public abstract void setAsGui(MainActivity activity);

    // sends a message to the player
    public abstract void sendInfo(BattleShipGameState info);

    // start the player
    public abstract void start();

    // whether this player requires a GUI
    public boolean requiresGui();

    // whether this player supports a GUI
    public boolean supportsGui();
}
