package com.example.mybali;

import static java.security.AccessController.getContext;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.color.utilities.Score;

public class DiaryEditActivity extends AppCompatActivity {

    Button btn_save;
//    private DiaryDB diaryDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_edit);

        //Demo用，儲存後先跳轉回日記主頁
        btn_save = findViewById(R.id.save_button);

//        DiaryDB dbHelper = new DiaryDB(getContext());
//        SQLiteDatabase db = dbHelper.getWritableDatabase();



        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiaryEditActivity.this,DiaryActivity.class);
                startActivity(intent);
            }
        });
    }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioBtn_1:
                if (checked) {
                    String value = "1";

//                    DiaryDB dbHelper = new DiaryDB(getApplicationContext());
//                    SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//                    ContentValues values = new ContentValues();
//                    values.put("Mood_Score",value);
//                    db.insert("Diaries",null,values);
                }
                    break;
            case R.id.radioBtn_2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radioBtn_3:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioBtn_4:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioBtn_5:
                if (checked)
                    // Pirates are the best
                    break;
        }
    }
}
