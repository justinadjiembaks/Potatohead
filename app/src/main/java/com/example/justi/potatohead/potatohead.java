package com.example.justi.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class potatohead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatohead);

        String[] Face = {"Nose", "Eyes", "Eyebrows", "Hat", "Arms", "Shoes", "Ears", "Mustache"};
        }

    boolean isChecked = ((CheckBox) findViewById(R.id.checkbox1)).isChecked();

    public boolean isChecked() {
        if (isChecked == true){

            R.id.hat.setVisibility(View.VISIBLE);
        }

        else{
            R.id.hat.

        }
        return isChecked;
    }

}
