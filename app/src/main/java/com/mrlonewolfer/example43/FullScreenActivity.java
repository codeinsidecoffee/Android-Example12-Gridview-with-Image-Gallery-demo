package com.mrlonewolfer.example43;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class FullScreenActivity extends AppCompatActivity {

    int mimgId;
    ImageView imageView;
    String RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        mimgId= bundle.getInt("mimgid");
        RatingBar=bundle.getString("imagrating");
        Toast.makeText(this, "new image is "+mimgId +"Image Rating Is: "+RatingBar, Toast.LENGTH_SHORT).show();
        imageView=findViewById(R.id.full_image_view);
        imageView.setImageResource(mimgId);
    }
}
