package com.example.asingh.apiapplication;

/**
 * Created by 2016asingh on 11/24/2015.
 */
import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

public class TimelineActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline);

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("fabric").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this).setTimeline(userTimeline).build();
        setListAdapter(adapter);
    }
}