package com.example.generationgirl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        String name = null;
        TextView textJava = findViewById(R.id.textJava);
        textJava.setText(name.toLowerCase());
    }
}