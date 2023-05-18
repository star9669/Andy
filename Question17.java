package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class Question17 extends AppCompatActivity {
EditText sendTo,subject,body;
Button sendMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question17);
        sendTo=findViewById(R.id.sendTo);
        subject=findViewById(R.id.subject);
        body=findViewById(R.id.body);
        sendMail=findViewById(R.id.sendMail);
        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);

                    // add three fields to intent using putExtra function
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{sendTo.getText().toString()});
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                    intent.putExtra(Intent.EXTRA_TEXT, body.getText().toString());

                    // set type of intent
//                intent.setType("message/rfc822");
                    intent.setType("text/plain");
                    // startActivity with intent with chooser as Email client using createChooser function
                    startActivity(Intent.createChooser(intent, "Choose an Email client :"));
                }
                catch(Exception e){
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}