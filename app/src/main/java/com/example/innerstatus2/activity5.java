package com.example.innerstatus2;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class activity5 extends activity3 {
    Button send_button;
    EditText send_text;
    //status update
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        Button nButton = (Button) findViewById(R.id.home1);
        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity5.this, activity7.class));
            }
        });
        send_text = (EditText) findViewById(R.id.CStatus);
        send_button = (Button)findViewById(R.id.submitstatus);
        send_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get the value which input by user in EditText
                // and convert it to string
                String str = send_text.getText().toString();

                // Create the Intent object of this class Context() to actvity6 class
                Intent intent = new Intent(getApplicationContext(), activity6.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("message_key", str);

                // start the Intent
                startActivity(intent);
            }

        });
    }
}



