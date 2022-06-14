package com.pgustavo.soccernews;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

//<a href="https://stackoverflow.com/a/14057777/3072570">Android Singleton with Global Context</a>

public class App extends Application {

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DynamicColors.applyToActivitiesIfAvailable(this);
        instance = this;
    }
}
