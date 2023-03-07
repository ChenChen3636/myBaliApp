package com.example.mybali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mybali.RoomDataBase.Diary;
import com.example.mybali.RoomDataBase.DiaryDatabase;
import com.facebook.stetho.Stetho;

import java.util.List;

public class DiaryActivity extends AppCompatActivity {


    DiaryAdapter diaryAdapter;
    Diary nowSelectData; //取得畫面上顯示中的資料內容

    Button btn_create_diary;
    TextView titleOutput,descriptionOutput,timeOutput;
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        btn_create_diary = findViewById(R.id.add_diary_button);
        titleOutput = findViewById(R.id.titleoutput);
        descriptionOutput = findViewById(R.id.descriptionoutput);
        timeOutput = findViewById(R.id.timeoutput);

        //recyclerView設置
        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));//設置分隔線

        setListener();

        //=============================初始化recyclerView==========================================//
        new Thread(()->{
            Log.d(null, "I'm here");
            List<Diary> diaries = DiaryDatabase.getInstance(this).getDiaryDao().displayAll();
            String testStr = TextUtils.join(",", diaries);
            Log.d("TAG", testStr);
            diaryAdapter = new DiaryAdapter(this,diaries);
            runOnUiThread(()->{
                recyclerView.setAdapter(diaryAdapter);

                diaryAdapter.setOnItemClickListener(new DiaryAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Diary diary) {}
                });

                //取得被選中的資料，並顯示於畫面*/
                diaryAdapter.setOnItemClickListener((diary)-> {//匿名函式(原貌在上方)
                    nowSelectData = diary;
                    titleOutput.setText(diary.getTitle());
                    descriptionOutput.setText(diary.getDescription());
                    timeOutput.setText((int) diary.getCreatedTime());
                });
            });
        }).start();
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
    }
}