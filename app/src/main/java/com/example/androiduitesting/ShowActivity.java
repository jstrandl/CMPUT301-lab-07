package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    TextView cityText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        cityText = findViewById(R.id.city_name);

        //Get city name from MainActivity https://learntodroid.com/how-to-switch-between-activities-in-android/
        cityText.setText(getIntent().getStringExtra("city name"));

        final Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> {
            // Go back to main activity (https://learntodroid.com/how-to-switch-between-activities-in-android/)
//            Toast.makeText(this, "Back button pressed", Toast.LENGTH_LONG).show(); //CHECK
            finish();
        });
    }
}
