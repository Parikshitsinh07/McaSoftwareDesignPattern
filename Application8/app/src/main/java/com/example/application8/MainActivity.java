package com.example.application8;

import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner animationSpinner;
    private ImageView imageView;
    private Animation selectedAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationSpinner=(Spinner) findViewById(R.id.spinner);
        imageView=(ImageView) findViewById(R.id.imageView);

        // Populate the spinner with animation names
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.animation_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        animationSpinner.setAdapter(adapter);

        // Set spinner item selection listener
        animationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Load animation based on selected item
                String selectedAnimationName=adapterView.getItemAtPosition(i).toString();
                selectedAnimation= getAnimation(selectedAnimationName);

                //Apply animation to imageView
                imageView.startAnimation(selectedAnimation);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    private  Animation getAnimation(String animationName)
    {
        switch(animationName)
        {
            case "Scale Animation":
                return AnimationUtils.loadAnimation(this,R.anim.scale_animation);

            case "Translate Animation":
                return AnimationUtils.loadAnimation(this,R.anim.translate_animation);

            case "Alpha Animation":
                return AnimationUtils.loadAnimation(this,R.anim.alpha_animation);

            case "Rotate Animation":
                return AnimationUtils.loadAnimation(this,R.anim.rotate_animation);

            default:
                return null;
        }
    }

}