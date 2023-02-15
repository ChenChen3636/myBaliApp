package com.example.mybali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiaryActivity extends AppCompatActivity {

    Button btn_create_diary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        btn_create_diary = findViewById(R.id.btnAddDiary);
        btn_create_diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiaryActivity.this,DiaryEditActivity.class);
                startActivity(intent);
            }
        });
    }
}