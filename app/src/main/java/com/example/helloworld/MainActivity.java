package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Not the best design for a button, could be done through the xml file and add a listener directly through the button.
        Button homeButton = findViewById(R.id.homeBtn);
        final int[] i = {0};
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtHello = findViewById(R.id.homeTxt);
                if(i[0] == 0){
                    EditText nameEdt = findViewById(R.id.textName);
                    txtHello.setText("Hello "+nameEdt.getText().toString());
                }
                else if (i[0] %2 == 1) {
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