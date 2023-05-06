package com.hist0r.oldfootballgate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Miracle extends AppCompatActivity {
    ImageButton BackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miracle);
        BackBtn = findViewById(R.id.backbtn1);

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Miracle.this,MainActivity.class));
                finish();
            }
        });
    }
}