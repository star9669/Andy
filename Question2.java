package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Question2 extends AppCompatActivity {

    Button b;
    EditText name,address,dob,email,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        b=findViewById(R.id.Enter);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        dob=findViewById(R.id.dob);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Question2_second.class);
                i.putExtra("name",name.getText().toString());
                i.putExtra("address",address.getText().toString());
                i.putExtra("dob",dob.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("contact",contact.getText().toString());
                i.putExtra("hi", new String[]{name.getText().toString(), address.getText().toString()});
                startActivity(i);

            }
        });
    }
}