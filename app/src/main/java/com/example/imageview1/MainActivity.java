package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
ImageView iv;

Butto btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        btn = findViewById(R.id.btn);

    }

    public void click(View view) {

    }
}