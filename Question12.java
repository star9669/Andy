package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Question12 extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    int imageList[]={R.drawable.dhoni1,R.drawable.dhoni2,R.drawable.dhoni3,R.drawable.dhoni4,
                    R.drawable.dhoni5,R.drawable.dhoni6,R.drawable.dhoni7,R.drawable.dhoni8,
                    R.drawable.dhoni9,R.drawable.dhoni10};
    int current_index;

    ImageButton back,forward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question12);
        imageSwitcher=findViewById(R.id.image_switcher);
        back=findViewById(R.id.back);
        forward=findViewById(R.id.forward);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image = new ImageView(Question12.this);
               return image;
            }
        });
        current_index=0;

        imageSwitcher.setImageResource(imageList[current_index]);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(current_index<=0){
                    imageSwitcher.setImageResource(imageList[imageList.length-1]);
                    current_index=imageList.length-1;
                }
                else{
                    current_index=current_index-1;
                    imageSwitcher.setImageResource(imageList[current_index]);
                }
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(current_index>=imageList.length-1){
                    current_index=0;
                    imageSwitcher.setImageResource(imageList[current_index]);
                }
                else{
                    current_index=current_index+1;
                    imageSwitcher.setImageResource(imageList[current_index]);
                }
            }
        });


    }
}