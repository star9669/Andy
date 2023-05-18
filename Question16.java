package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Question16 extends AppCompatActivity {
EditText num,sms;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question16);
        num=findViewById(R.id.number);
        sms=findViewById(R.id.message);
        send=findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SmsManager manager = SmsManager.getDefault();
                    manager.sendTextMessage(num.getText().toString(), null, sms.getText().toString(), null, null);
                    Toast.makeText(getApplicationContext(), "Message Send Sucessfull.", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e) {
                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}