package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    String cityName;
    TextView cityText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        cityText = findViewById(R.id.city_name);

        cityText.setText(cityName);

        final Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(v -> {
            // Go back to main activity (https://learntodroid.com/how-to-switch-between-activities-in-android/)
            finish();
        });
    }
}
