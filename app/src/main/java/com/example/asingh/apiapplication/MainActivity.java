package com.example.asingh.apiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;


import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    private static final String TWITTER_KEY = "06iesL5YENfCer7OyJycHrCCR";
    private static final String TWITTER_SECRET = "6lt9m1g01iD4YypBbNypolN6KD99h1jGKc0QmLzDeWfphtXifD";

    private TwitterLoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Make sure that the loginButton hears the result from any
        // Activity that it triggered.
        loginButton.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
