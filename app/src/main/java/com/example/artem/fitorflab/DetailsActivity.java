package com.example.artem.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;


public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView exerciseTitle = (TextView) findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = (ImageView) findViewById(R.id.exerciseImg);
        LinearLayout bg = (LinearLayout) findViewById(R.id.mainBg);

        String exercise = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        exerciseTitle.setText(exercise);

        if (exercise.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImg.setImageResource(R.drawable.weight);
            bg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exercise.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exerciseImg.setImageResource(R.drawable.yoga);
            bg.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            exerciseImg.setImageResource(R.drawable.hearts);
            bg.setBackgroundColor(Color.parseColor("#52ad56"));

        }


    }
}
