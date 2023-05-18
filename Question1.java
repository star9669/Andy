package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Log.d("LifeCycleOfActivity","OnCreate");
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycleOfActivity","OnDestroy");
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycleOfActivity","OnStart");
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycleOfActivity","OnRestart");
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycleOfActivity","OnPause");
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycleOfActivity","OnResume");
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycleOfActivity","OnStop");
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }
}