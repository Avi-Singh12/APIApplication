package com.example.asingh.apiapplication;

/**
 * Created by 2016asingh on 11/24/2015.
 */
import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
//import com.twitter.sdk.android.core.internal.GuestCallback;
import com.twitter.sdk.android.core.internal.TwitterApiConstants;
import com.twitter.sdk.android.core.models.Search;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

public class TimelineActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline);

        Bundle extras = getIntent().getExtras();
        final String twitterHandle = extras.getString("HANDLE");

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName(twitterHandle).build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this).setTimeline(userTimeline).build();
        setListAdapter(adapter);

//        TwitterApiClient twitterApiClient =  TwitterCore.getInstance().getApiClient(guestAppSession);
//        twitterApiClient.getSearchService().tweets("#fabric", null, null, null, null, 50, null, null, null, true, new GuestCallback<>(new Callback<Search>() {
//            @Override
//            public void success(Result<Search> result) {
//                // use result tweets
//
//            }
//
//            @Override
//            public void failure(TwitterException exception) {
//                // handle exceptions
//            }
//        }));

    }
}