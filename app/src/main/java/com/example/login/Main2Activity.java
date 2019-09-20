package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
        Button back,submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        submit=findViewById(R.id.submit);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainActivity();

            }
        });


    }
    public void OpenMainActivity(){
        Intent BACK = new Intent(this,MainActivity.class);
        startActivity(BACK);
    }
    public void toDo(View v){
        Toast.makeText(getApplicationContext(), "submited !", Toast.LENGTH_SHORT).show();

    }
    }

