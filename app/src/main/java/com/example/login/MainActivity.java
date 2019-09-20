package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.Main2Activity;
import com.example.login.R;
import com.example.login.the_main_interface;

public class MainActivity extends AppCompatActivity {
    Button  login,signin;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=(Button)findViewById(R.id.sing_up);
        login=(Button)findViewById(R.id.log_in);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensighup();

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmain();

            }
        });

            }
    public void opensighup(){
        Intent singup = new Intent(this, Main2Activity.class);
        startActivity(singup);
    }
    public void openmain(){
        Intent login =new Intent(this, the_main_interface.class);
        startActivity(login);
    }




    }

