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

    ImageView hat, nose, mustache, shoes, eyes, eyebrows, ears, arms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatohead);

        hat = (ImageView)findViewById(R.id.hat);
        nose = (ImageView) findViewById(R.id.nose);
        mustache = (ImageView) findViewById(R.id.mustache);
        shoes = (ImageView) findViewById(R.id.shoes);
        eyes = (ImageView) findViewById(R.id.eyes);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ears = (ImageView) findViewById(R.id.ears);
        arms = (ImageView) findViewById(R.id.arms);
    }
    public void boxclicked(View v){
        hat.setVisibility(View.VISIBLE);
    }

    public void box1clicked(View v){
        nose.setVisibility(View.VISIBLE);
    }

    public void box2clicked(View v){
        mustache.setVisibility(View.VISIBLE);
    }

    public void box3clicked(View v){
        shoes.setVisibility(View.VISIBLE);
    }
}
