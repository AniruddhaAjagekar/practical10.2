package com.example.practical102;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { Button b1,b2;
    EditText e1,e2,e3,e4,e5,e6; DatePicker d1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.cal);
        b2 = (Button) findViewById(R.id.smt);
        e1 = (EditText) findViewById(R.id.fname);
        e2 = (EditText) findViewById(R.id.lname);
        d1= (DatePicker) findViewById(R.id.date);
        e3  =  (EditText)findViewById(R.id.date1);
        e4 = (EditText)findViewById(R.id.a1);
        e5 = (EditText)findViewById(R.id.a2);
        e6 = (EditText)findViewById(R.id.a3);

        b1.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        { finish();
        }
        });

        b2.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
//DOB
            e3.setText("Selected Date: " + d1.getDayOfMonth() + "/" + (d1.getMonth() + 1) + "/" + d1.getYear());
//firstname
            if (e1.getText().toString().equals("")) { Toast.makeText(MainActivity.this, "Please Enter Your First Name",
                    Toast.LENGTH_SHORT).show();
            }
//lastname
            else if (e2.getText().toString().equals("")) { Toast.makeText(MainActivity.this, "Please Enter Your Last Name",
                    Toast.LENGTH_SHORT).show();
            }
//village
            else if (e4.getText().toString().equals("")) { Toast.makeText(MainActivity.this, "Please Enter Your Village",

                    Toast.LENGTH_SHORT).show();
            }
//taluka
            else if (e5.getText().toString().equals("")) { Toast.makeText(MainActivity.this, "Please Enter Your Taluka",
                    Toast.LENGTH_SHORT).show();
            }
//distric
            else if (e6.getText().toString().equals("")) { Toast.makeText(MainActivity.this, "Please Enter Your Distric",
                    Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Successfully Submitted...!", Toast.LENGTH_SHORT).show();
            }
        }
        });

    }

}

