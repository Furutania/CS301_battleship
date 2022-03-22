package com.example.cs301_battleship;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midgame);

        getSupportActionBar().hide();
    }

    public void onBackPressed() {
        Intent i = new Intent(SecondMainActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
