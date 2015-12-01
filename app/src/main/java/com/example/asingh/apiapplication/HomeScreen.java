package com.example.asingh.apiapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by 2016asingh on 12/1/2015.
 */
public class HomeScreen extends Activity {

    private static final String TWITTER_KEY = "06iesL5YENfCer7OyJycHrCCR";
    private static final String TWITTER_SECRET = "6lt9m1g01iD4YypBbNypolN6KD99h1jGKc0QmLzDeWfphtXifD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
//        TwitterCore core = Twitter.core;

        setContentView(R.layout.home_screen);

        Button nflButton = (Button) findViewById(R.id.NFLButton);
        nflButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TimelineActivity.class);
                i.putExtra("HANDLE", "NFL");
                startActivity(i);
            }
        });

        Button nbaButton = (Button) findViewById(R.id.NBAButton);
        nbaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TimelineActivity.class);
                i.putExtra("HANDLE", "NBA");
                startActivity(i);
            }
        });

        Button nhlButton = (Button) findViewById(R.id.NHLButton);
        nhlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TimelineActivity.class);
                i.putExtra("HANDLE", "NHL");
                startActivity(i);
            }
        });
    }
}
