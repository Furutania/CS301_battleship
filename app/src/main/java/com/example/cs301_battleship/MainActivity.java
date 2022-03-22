package com.example.cs301_battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

        //getSupportActionBar().hide();
        Button nextButton = findViewById(R.id.confirm_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                configureNextButton();
            }
        });
    }
    //test

    private void configureNextButton() {
        Intent switchActivityIntent = new Intent(this, SecondMainActivity.class);
        startActivity(switchActivityIntent);
    }
}