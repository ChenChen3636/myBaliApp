package com.example.mybali;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//public class DiaryAdapter<Diary> extends BaseAdapter {
//
//    private final Context context;
//    private final ArrayList<Diary>diaries;
//    private SimpleDateFormat dateFormat;
//
//
//    @SuppressLint("SimpleDateFormat")
//    public DiaryAdapter(Context context, ArrayList<Diary>diaries){
//        this.context = context;
//        this.diaries = diaries;
//        this.dateFormat = new SimpleDateFormat("yyyy, MM/dd");
//    }
//
//    @Override
//    public int getCount() {
//        return diaries.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return diaries.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View contenView, ViewGroup parent) {
//
//        if (contenView == null){
//            contenView = ((Activity)context).getLayoutInflater().inflate(R.layout.item_diary,null);
//        }
//        TextView timeText = (TextView) contenView.findViewById(R.id.diary_date_tv);
//        TextView noteText = (TextView) contenView.findViewById(R.id.diary_content_tv);
//
//        timeText.setText("2023/2/20");
//        noteText.setText("今天星期一，猴子穿新衣");
//        return contenView;
//    }
//}
