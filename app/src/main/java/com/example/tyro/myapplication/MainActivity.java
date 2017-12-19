package com.example.tyro.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private Button logInButton, logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logInButton = (Button) findViewById(R.id.LoginButtonId);
        logOutButton = (Button) findViewById(R.id.LogOutButtonId);
        textView = (TextView) findViewById(R.id.TextAreaId);
        logInButton.setOnClickListener(this);
        logOutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.LoginButtonId)
            textView.setText("Log in button is clicked");
        else if(v.getId() == R.id.LogOutButtonId)
            textView.setText("Log out button is clicked");
    }
}