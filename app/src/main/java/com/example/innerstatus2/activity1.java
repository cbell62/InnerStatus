package com.example.innerstatus2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity1 extends MainActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity1);

            Button nButton = (Button) findViewById(R.id.login);
            nButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(activity1.this, activity3.class));
                }
            });

        }
    }
