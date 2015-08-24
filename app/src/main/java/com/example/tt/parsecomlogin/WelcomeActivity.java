package com.example.tt.parsecomlogin;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.parse.ParseUser;

public class WelcomeActivity extends ActionBarActivity {
    Button logOutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ParseUser currentUser = ParseUser.getCurrentUser();
        String userName = currentUser.getUsername().toString();
        TextView txtUser = (TextView) findViewById(R.id.txtUser);
        txtUser.setText("You are Log in as : "+userName);
        logOutBtn = (Button) findViewById(R.id.logOut);
        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser.logOut();
                finish();
            }
        });

    }


}
