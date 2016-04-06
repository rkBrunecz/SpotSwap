package com.example.randy.to_be_determined;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    /* PRIVATE VARIABLES */
    private String userName;
    private Button postBtn, searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Get the username from the previous activity */
        Intent intent = getIntent();
        String userName = intent.getStringExtra(LogInActivity.EXTRA_MESSAGE);

        /* Set up properties of the action bar */
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#FFFFFF'>" + userName + "</font>"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

         /* Set up the buttons */
        postBtn = (Button)findViewById(R.id.postSpotBtn);
        searchBtn = (Button)findViewById(R.id.findSpotBtn);

        postBtn.setOnClickListener(this);
        searchBtn.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        //DO NOTHING
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.postSpotBtn:

                break;

            case R.id.findSpotBtn:

                break;
        }
    }
}
