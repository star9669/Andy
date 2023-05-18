package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Question8 extends AppCompatActivity {

    EditText rate;
    Button b;
    TextView output;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        rate=findViewById(R.id.rate);
        rg=findViewById(R.id.radioGroup);
        b=findViewById(R.id.button);
        output=findViewById(R.id.output);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!rate.getText().toString().isEmpty()){
                    if(rg.getCheckedRadioButtonId()==R.id.radioButton1){
                        float x=Float.parseFloat( rate.getText().toString())/12;
                        output.setText("Rate Yearly to Monthly : "+x);
                    }
                    else{
                        float x=Float.parseFloat( rate.getText().toString())*12;
                        output.setText("Rate Monthly to Yearly : "+x);
                    }
                }

            }
        });
    }
}