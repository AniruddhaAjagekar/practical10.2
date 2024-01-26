package com.example.practical102;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.ede1);
        EditText e2 = (EditText) findViewById(R.id.ede2);
        EditText e3 = (EditText) findViewById(R.id.ede3);
        EditText e4 = (EditText) findViewById(R.id.ede4);
        EditText e5 = (EditText) findViewById(R.id.ede5);

        Button b1 = (Button) findViewById(R.id.btnn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Name="+e1.getText().toString()+"\nclass="+e2.getText().toString()+"\nEmail="+e3.getText().toString()+"\nVillage="+e4.getText().toString()+"\nphone no"+e5.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}