package com.example.mybali.RoomDataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Diary.class},version = 1,exportSchema = true)
public abstract class DiaryDatabase extends RoomDatabase {
    public static final String dbName = "BaliDB";
    public static volatile DiaryDatabase instance;

    public static synchronized DiaryDatabase getInstance(Context context){
        if (instance == null){
            instance = create(context);//創建新的資料庫
        }
        return instance;
    }

    private static DiaryDatabase create(final Context context){
        return Room.databaseBuilder(context,DiaryDatabase.class,dbName).build();
    }


    public abstract DiaryDao getDiaryDao();//設置對外窗口
}
