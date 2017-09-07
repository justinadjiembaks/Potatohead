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

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        int hatValue = hat.getVisibility();
        if (hatValue == View.VISIBLE){
            outState.putInt("hat",1);
        }

        int eyesValue = eyes.getVisibility();
        if (eyesValue == View.VISIBLE){
            outState.putInt("eyes",1);
        }

        int armsValue = arms.getVisibility();
        if (armsValue == View.VISIBLE){
            outState.putInt("arms",1);
        }
        int shoesValue = shoes.getVisibility();
        if (shoesValue == View.VISIBLE){
            outState.putInt("shoes",1);
        }
        int mustacheValue = mustache.getVisibility();
        if (mustacheValue == View.VISIBLE){
            outState.putInt("mustache",1);
        }

        int eyebrowsValue = eyebrows.getVisibility();
        if (eyebrowsValue == View.VISIBLE){
            outState.putInt("eyebrows",1);
        }
        int noseValue = nose.getVisibility();
        if (noseValue == View.VISIBLE){
            outState.putInt("nose",1);
        }
        int earsValue = ears.getVisibility();
        if (earsValue == View.VISIBLE){
            outState.putInt("ears",1);
        }

    }
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        int HatState = inState.getInt("hat",0);
        if (HatState == 1){
            hat.setVisibility(View.VISIBLE);
        }

        int EyesState = inState.getInt("eyes",0);
        if (EyesState == 1){
            eyes.setVisibility(View.VISIBLE);
        }

        int MustacheState = inState.getInt("mustache",0);
        if (MustacheState == 1){
            mustache.setVisibility(View.VISIBLE);
        }
        int ShoesState = inState.getInt("shoes",0);
        if (ShoesState == 1){
            shoes.setVisibility(View.VISIBLE);
        }
        int NoseState = inState.getInt("nose",0);
        if (NoseState == 1){
            nose.setVisibility(View.VISIBLE);
        }
        int EarsState = inState.getInt("ears",0);
        if (EarsState == 1){
            ears.setVisibility(View.VISIBLE);
        }
        int ArmsState = inState.getInt("arms",0);
        if (ArmsState == 1){
            arms.setVisibility(View.VISIBLE);
        }
        int EyebrowsState = inState.getInt("eyebrows",0);
        if (EyebrowsState == 1){
            eyebrows.setVisibility(View.VISIBLE);
        }
    }
}
