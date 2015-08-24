package com.example.tt.parsecomlogin;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by TT
 */
public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "S4DBkUe79sTQso1R1gU3kvffpHjT3Vx25xsYXkOL", "9Y3OKeG4DbXyme1eGzlVRE9U6gqu1F4Exnx3epIk");

        ParseUser.enableAutomaticUser();
        ParseACL defaultAcl = new ParseACL();
        defaultAcl.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultAcl, true);

    }
}
