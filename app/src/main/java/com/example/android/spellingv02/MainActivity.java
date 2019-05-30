package com.example.android.spellingv02;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView quiz,ans, a1, a2, a3, a4;
    private Button next;
    private int i = 0;
    private int score = 0;
    private Data mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz = (TextView)findViewById(R.id.quiz);
        ans = (TextView)findViewById(R.id.ans);

        a1=(TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3=(TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);

        next = (Button) findViewById(R.id.next);

        ans.setVisibility(View.GONE);
        update();

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a1.getText().toString().equals(ans.getText().toString())) {
//                    Toast.makeText(getApplicationContext(), "right", Toast.LENGTH_SHORT).show();
                    a1.setBackgroundColor(Color.GREEN);
                    score += 1;
                }else{
  //                  Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                    a1.setBackgroundColor(Color.RED);
                    score += 0;
                }
                a2.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2.getText().toString().equals(ans.getText().toString())) {
                    a2.setBackgroundColor(Color.GREEN);
                    score += 1;
                }else{
                    a2.setBackgroundColor(Color.RED);
                    score += 0;
                }
                a1.setEnabled(false);
                a3.setEnabled(false);
                a4.setEnabled(false);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a3.getText().toString().equals(ans.getText().toString())) {
                    a3.setBackgroundColor(Color.GREEN);
                    score += 1;
                }else{
                    a3.setBackgroundColor(Color.RED);
                    score += 0;
                }
                a1.setEnabled(false);
                a2.setEnabled(false);
                a4.setEnabled(false);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4.getText().toString().equals(ans.getText().toString())) {
                    a4.setBackgroundColor(Color.GREEN);
                    score += 1;
                }else{
                    a4.setBackgroundColor(Color.RED);
                    score += 0;
                }
                a1.setEnabled(false);
                a2.setEnabled(false);
                a3.setEnabled(false);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                int f =mdata.getQuestion().length;
           //     Toast.makeText(getApplicationContext(), "SCORE: " + score, Toast.LENGTH_SHORT).show();
                if(i != f) {
                    update();
                }else {
                    //Toast.makeText(getApplicationContext(), "End of quiz", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,LastPageActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("s", score);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }

    public void update(){

        mdata = new Data();
        quiz.setText(mdata.getQuestion()[i]);
        a1.setText(mdata.getOption1()[i]);
        a2.setText(mdata.getOption2()[i]);
        a3.setText(mdata.getOption3()[i]);
        a4.setText(mdata.getOption4()[i]);
        ans.setText(mdata.getAnswer()[i]);

        a1.setBackgroundColor(Color.WHITE);
        a2.setBackgroundColor(Color.WHITE);
        a3.setBackgroundColor(Color.WHITE);
        a4.setBackgroundColor(Color.WHITE);

        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        a4.setEnabled(true);

    }
}
