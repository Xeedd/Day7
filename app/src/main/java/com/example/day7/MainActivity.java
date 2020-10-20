package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private ImageView imgCar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imgCar = findViewById(R.id.imgCar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imgCar.getVisibility() == View.VISIBLE) {
                    imgCar.setVisibility(View.GONE);
                    button.setText("Show Image");
                } else {
                    imgCar.setVisibility(View.VISIBLE);
                    button.setText("Hide Image");
                }


            }
        });

    }
}