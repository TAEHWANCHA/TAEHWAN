package com.example.a15n540_ut50k.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnleader, btnmeeting, btndistribution, btnprogress, btngongu, btnmsgboard, btnadmin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("조별과제 관리");
        btnleader = (Button) findViewById(R.id.Leader);
        btnmeeting = (Button) findViewById(R.id.meeting);
        btndistribution = (Button) findViewById(R.id.distribution);
        btnprogress = (Button) findViewById(R.id.progress);
        btngongu = (Button) findViewById(R.id.gongu);
        btnmsgboard = (Button) findViewById(R.id.msgboard);
        btnadmin = (Button) findViewById(R.id.admin);



        btnleader.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), teamleaderactivity.class);
                startActivity(intent);

            }
        });

        btnmeeting.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), meetingact.class);
                startActivity(intent);

            }
        });

        btndistribution.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), distributeact.class);
                startActivity(intent);

            }
        });

        btnprogress.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), progact.class);
                startActivity(intent);

            }
        });


        btngongu.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), gonguact.class);
                startActivity(intent);

            }
        });

        btnmsgboard.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), msgAct.class);
                startActivity(intent);

            }
        });

        btnadmin.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), adminAct.class);
                startActivity(intent);

            }
        });




    }
}
