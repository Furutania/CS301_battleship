package com.example.cs301_battleship;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class onTouchListener implements View.OnTouchListener {

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = view.getX();
        float y = view.getY();
        float screenWidth = view.getWidth();
        float screenHeight = view.getHeight();
        Log.d("Tap Coordinates", ": " + x + y);
        return false;
    }
}
