package com.example.a15n540_ut50k.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class meetingact extends AppCompatActivity {

    Button btnback;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meeting);

        btnback = (Button) findViewById(R.id.backfrommeeting);
        btnback.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });



    }
}