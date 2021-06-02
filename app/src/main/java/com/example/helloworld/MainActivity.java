package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeButton = findViewById(R.id.homeBtn);
        final int[] i = {0};
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtHello = findViewById(R.id.homeTxt);
                if (i[0] %2 == 0) {
                    txtHello.setText("Hey! I can change!");
                }
                else{
                    txtHello.setText("Wanna see me do it again?");
                }
                i[0]++;
            }
        });
    }
}