package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Question11 extends AppCompatActivity {

    ImageView bulp;
    ToggleButton onoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question11);
        bulp=findViewById(R.id.bulp);
        onoff=findViewById(R.id.toggleButton);

        onoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onoff.isChecked()){
                    bulp.setImageResource(R.drawable.bulpon);
                }
                else{
                    bulp.setImageResource(R.drawable.bulpoff);
                }
            }
        });


    }
}