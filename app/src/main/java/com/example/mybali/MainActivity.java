package com.example.mybali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_location,btn_apptime,btn_diary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_location = (Button) findViewById(R.id.btn_location);
        btn_apptime = (Button) findViewById(R.id.btn_app);
        btn_diary = (Button) findViewById(R.id.btn_diary);
        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LocationActivity.class);
                startActivity(intent);
            }
        });
        btn_apptime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ApptimeActivity.class);
                startActivity(intent);
            }
        });
        btn_diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DiaryActivity.class);
                startActivity(intent);
            }
        });

    }
}