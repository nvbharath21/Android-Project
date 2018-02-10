package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et5;
    TextView et3;
    Button et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.Linera_EditText);
        et2=(EditText)findViewById(R.id.Linear_EditTexts);
        et3=(TextView)findViewById(R.id.Linear_Textview);
        et4=(Button)findViewById(R.id.Linear_Buton);
        et5=(EditText)findViewById(R.id.Linear_EditTextss);

        et4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String  value=et1.getText().toString();
                String  value2=et2.getText().toString();
                String  value3=et5.getText().toString();

               int res=Integer.parseInt(value)+Integer.parseInt(value2)+Integer.parseInt(value3);

                et3.setText("output of three number is : "+res);

                Toast.makeText(MainActivity.this, " "+res, Toast.LENGTH_SHORT).show();

            }
        });
        Log.d("TAG","Oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","Onstart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","Onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
            Log.d("TAG","Onpause");

        }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","Onstop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","OnRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","OnDestory");
    }
}


