package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity23 extends AppCompatActivity {

    TextView et4;
    Button btn5;
    EditText name,number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main423);


        et4 = (TextView) findViewById(R.id.text);
        btn5 = (Button) findViewById(R.id.ok);
        name=(EditText)findViewById(R.id.et_one);
        number=(EditText)findViewById(R.id.et_two);


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String efg =name.getText().toString();
                String ijk = number.getText().toString();
                int value=0;
                if(!ijk.isEmpty()) {
                    value = Integer.parseInt(ijk);
                }


                Intent i = new Intent(Main4Activity23.this, NewActivity.class);
                i.putExtra("Bharath",efg);
                i.putExtra("Key2",value);

                startActivity(i);



            }
        });
//        et4.append("OnCreate\n");
        Log.e("ACTIVITY", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
//        et4.append("OnStart\n");
        Log.e("ACTIVITY", "OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
//        et4.append("OnResume\n");
        Log.e("ACTIVITY", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ACTIVITY", "onPause");
//        et4.append("OnPause\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ACTIVITY", "onRestart");
//        et4.append("onRestart\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ACTIVITY", "onStop");
//        et4.append("OnStop\n");
    }
}
