package com.example.android_assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class Question14 extends AppCompatActivity {

    Gallery gallery;
    ImageView imageView;
    int imageList[]={R.drawable.dhoni1,R.drawable.dhoni2,R.drawable.dhoni3,R.drawable.dhoni4,
            R.drawable.dhoni5,R.drawable.dhoni6,R.drawable.dhoni7,R.drawable.dhoni8,
            R.drawable.dhoni9,R.drawable.dhoni10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question14);
        gallery=(Gallery)findViewById(R.id.gallery);
        imageView=findViewById(R.id.galleryView);

        GalleryAddapter adapter=new GalleryAddapter(getApplicationContext(),imageList);
        gallery.setAdapter(adapter);
        gallery.setSpacing(10);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                imageView.setImageResource(imageList[i]);
            }
        });
    }
}