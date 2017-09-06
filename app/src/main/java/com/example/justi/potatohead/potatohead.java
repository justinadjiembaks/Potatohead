package com.example.justi.potatohead;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class potatohead extends AppCompatActivity {

    ImageView hat, nose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatohead);

        hat = (ImageView)findViewById(R.id.hat);
        nose = (ImageView) findViewById(R.id.nose);
    }
    public void box1clicked(View v){
        hat.setVisibility(View.VISIBLE);


    }
}
