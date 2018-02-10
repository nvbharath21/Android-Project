package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView et6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        et6 = (TextView) findViewById(R.id.abc);

        Bundle abc = getIntent().getExtras();
        if (abc != null) {
            String str = abc.getString("Bharath");
            int x = abc.getInt("Key2");

            et6.setText(str+"  -  "+x);

        }
    }
}
