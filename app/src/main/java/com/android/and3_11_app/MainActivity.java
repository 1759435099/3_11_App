package com.android.and3_11_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView = null;
    private ImageView imageView3 = null;
    private Button bt1 = null;
    private Button bt2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        bt1 = (Button) findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == bt1) {
                    imageView.setImageResource(R.drawable.tu);
                }
            }
        });
        bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == bt2) {
                    imageView3.setImageResource(R.drawable.tu);
                }
            }
        });
    }
}