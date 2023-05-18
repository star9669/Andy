package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class Question2_second extends AppCompatActivity {
    TextView name,address,dob,email,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2_second);
        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        dob=findViewById(R.id.dob);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);

        Intent i=getIntent();

        name.setText(i.getStringExtra("name"));
        address.setText(i.getStringExtra("address"));
        dob.setText(i.getStringExtra("dob"));
        email.setText(i.getStringExtra("email"));
        contact.setText(i.getStringExtra("contact"));

    }
}