package com.example.cs301_battleship;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midgame);

        getSupportActionBar().hide();
    }
}
