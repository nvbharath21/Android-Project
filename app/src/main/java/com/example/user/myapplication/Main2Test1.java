package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Test1 extends AppCompatActivity {

    Button linear_button, two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_test1);

        linear_button = (Button) findViewById(R.id.linear_button);
        two = (Button) findViewById(R.id.linear_buttons);


        linear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Test1.this, MainActivity.class);
                startActivity(i);
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Test1.this, Main2Activity.class);
                startActivity(i);
                Toast.makeText(Main2Test1.this, "clicked ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
