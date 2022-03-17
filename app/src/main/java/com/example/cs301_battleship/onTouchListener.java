package com.example.cs301_battleship;

import android.view.MotionEvent;
import android.view.View;

public class onTouchListener implements View.OnTouchListener {

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = view.getX();
        float y = view.getY();
        return false;
    }
}
