package com.example.mybali;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.mybali.RoomDataBase.Diaries;
import com.facebook.stetho.Stetho;

import java.util.ArrayList;

public class DiaryActivity<Diary> extends AppCompatActivity {


//    DiaryAdapter diaryAdapter;
//    Diaries nowSelectData; //取得畫面上顯示中的資料內容


    Button btn_create_diary;
    ListView diaryListView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        Stetho.initializeWithDefaults(this); //設置stetho資料庫監視


        btn_create_diary = findViewById(R.id.add_diary_button);
        diaryListView = findViewById(R.id.list_diary);

        setView();
        setListener();


    }

    private void setView(){
//        if(diaryDB == null){
//            diaryDB = new DiaryDB(this);
//        }
//        ArrayList<Diary>diaries = diaryDB.getALLDiaries();

//        DiaryAdapter diaryAdapter = new DiaryAdapter(this,diaries);
//        diaryListView.setAdapter(diaryAdapter);
    }

    private void setListener(){

        btn_create_diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiaryActivity.this,DiaryEditActivity.class);
                startActivity(intent);
            }
        });
        diaryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
//                Diary diary = (Diary)diaryListView.getItemAtPosition(position);
//                Intent intent = new Intent();
//                intent.setClass(DiaryActivity.this,diary);
//                startActivity(intent);
            }
        });
    }
}