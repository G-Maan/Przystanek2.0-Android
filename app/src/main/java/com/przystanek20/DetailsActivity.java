package com.przystanek20;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Pawel Mielniczuk on 2017-06-09.
 */
public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();

        CardView cardView = (CardView) findViewById(R.id.card_view);
        ImageView coverForegroundImage = (ImageView) findViewById(R.id.cover_fg);
        TextView details = (TextView) findViewById(R.id.text_details);
        ImageView coverBackgroundImage = (ImageView) findViewById(R.id.cover_bg);
        TextView bgDetails = (TextView) findViewById(R.id.text_bg_details);
    }
}
