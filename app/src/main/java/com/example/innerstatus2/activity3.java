package com.example.innerstatus2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity3 extends activity1{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity3);
            Button nButton = (Button) findViewById(R.id.newstatus);
            nButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(activity3.this, activity5.class));
                }
            });

            Button mButton = (Button) findViewById(R.id.logout);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(activity3.this, activity9.class));
                }
            });
        }


    }
