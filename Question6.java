package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.widget.Toast;

public class Question6 extends AppCompatActivity {

    Spinner spinner;
    String[] contents={"Java","C++","Android","C","Python","JavaScript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        spinner=findViewById(R.id.spin);
        ArrayAdapter ad= new ArrayAdapter(getApplicationContext() , android.R.layout.simple_spinner_dropdown_item, contents);
        spinner.setAdapter(ad);
        spinner.getSelectedItem();


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getApplicationContext(),Question6_second.class);
                intent.putExtra("Selected Item",contents[spinner.getSelectedItemPosition()]);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


}