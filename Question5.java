package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {

    EditText email,pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        email=findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("kolteshreeganesh1155@gmail.com")){
                    if(pass.getText().toString().equals("pass@123@1155")){
                        Toast.makeText(getApplicationContext(),"Login successfully.",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Invalid Password.",Toast.LENGTH_LONG).show();

                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Email.",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}