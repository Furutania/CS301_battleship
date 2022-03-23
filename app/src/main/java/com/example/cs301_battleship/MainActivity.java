package com.example.cs301_battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.setup_phase);

        SurfaceView setupBoard = findViewById(R.id.surfaceView3);

        //getSupportActionBar().hide();
        Button nextButton = findViewById(R.id.confirm_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, SecondMainActivity.class);
                switchActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(switchActivityIntent);
            }
        });

        setupBoard.setOnTouchListener(
                new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float screenWidth = view.getWidth();
            float screenHeight = view.getHeight();
            Log.d("Tap Coordinates", ": " + x + ", " + y);
            return false;
        }});
    }
    //test

}