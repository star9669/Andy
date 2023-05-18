package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Question6_second extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6_second);
        t=findViewById(R.id.selected);
        Intent i=getIntent();
        t.setText("Selected item is : "+i.getStringExtra("Selected Item"));
    }
}