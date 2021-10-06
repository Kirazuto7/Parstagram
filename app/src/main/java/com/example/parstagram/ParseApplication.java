package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WOt6aI9Gb1QrGv0BGpYTDk46SdffeLeNqpKhVnsh")
                .clientKey("EmiogyMTySnunAAwdaTJHwYbHO5hVCDo5yw6ub5A")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
