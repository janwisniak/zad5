package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;
    private TextView likeCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeCounter = findViewById(R.id.likeCounter);
        Button likeButton = findViewById(R.id.likeButton);
        Button unlikeButton = findViewById(R.id.unlikeButton);
        Button saveButton = findViewById(R.id.saveButton);

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updateLikeCounter();
            }
        });

        unlikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeCount > 0) {
                    likeCount--;
                }
                updateLikeCounter();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Brak funkcji dla przycisku "ZAPISZ"
            }
        });
    }

    private void updateLikeCounter() {
        likeCounter.setText(likeCount + " polubień");
    }
}
