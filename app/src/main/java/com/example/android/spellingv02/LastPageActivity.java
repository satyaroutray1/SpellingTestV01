package com.example.android.spellingv02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LastPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("s");
        String a = Integer.toString(score);
        TextView tv = (TextView)findViewById(R.id.result);
        tv.setText(a);
    }
}