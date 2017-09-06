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
        if (hat.getVisibility()== View.VISIBLE){
            hat.setVisibility(View.INVISIBLE);
        }
        else{
            hat.setVisibility(View.VISIBLE);
        }
    }

    public void box1clicked(View v){
        if (nose.getVisibility()== View.VISIBLE){
            nose.setVisibility(View.INVISIBLE);
        }
        else{
            nose.setVisibility(View.VISIBLE);
        }
    }

    public void box2clicked(View v){
        if (mustache.getVisibility()== View.VISIBLE){
            mustache.setVisibility(View.INVISIBLE);
        }
        else{
            mustache.setVisibility(View.VISIBLE);
        }

    }

    public void box3clicked(View v){
        if (shoes.getVisibility()== View.VISIBLE){
            shoes.setVisibility(View.INVISIBLE);
        }
        else{
            shoes.setVisibility(View.VISIBLE);
        }
    }

    public void box4clicked(View v){
        if (eyes.getVisibility()== View.VISIBLE){
            eyes.setVisibility(View.INVISIBLE);
        }
        else{
            eyes.setVisibility(View.VISIBLE);
        }
    }

    public void box5clicked(View v){
        if (arms.getVisibility()== View.VISIBLE){
            arms.setVisibility(View.INVISIBLE);
        }
        else{
            arms.setVisibility(View.VISIBLE);
        }
    }
    public void box6clicked(View v){
        if (eyebrows.getVisibility()== View.VISIBLE){
            eyebrows.setVisibility(View.INVISIBLE);
        }
        else{
            eyebrows.setVisibility(View.VISIBLE);
        }
    }

    public void box7clicked(View v){
        if (ears.getVisibility()== View.VISIBLE){
            ears.setVisibility(View.INVISIBLE);
        }
        else{
            ears.setVisibility(View.VISIBLE);
        }
    }

}
