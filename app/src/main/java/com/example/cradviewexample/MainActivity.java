package com.example.cradviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CardView cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardview = findViewById(R.id.cardview);

        cardview.setRadius(5.0f);  // Set the corner radius in pixels
        cardview.setCardElevation(11.0f);  // Set the card elevation in pixels
        cardview.setUseCompatPadding(true);  // Use compatible padding to prevent clipping on pre-Lollipop devices
    }
}
