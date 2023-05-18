package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Question15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question15);

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.bank_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){
            case R.id.deposit:
                Toast.makeText(this, "Clicked On Deposit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.withdraw:
                Toast.makeText(this, "Clicked On Withdraw", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.balance:
                Toast.makeText(this, "Clicked On Balance enquiry", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}