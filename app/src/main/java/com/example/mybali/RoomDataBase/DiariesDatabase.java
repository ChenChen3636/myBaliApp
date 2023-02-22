package com.example.mybali.RoomDataBase;


import android.content.Context;

import androidx.room.Room;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mybali.RoomDataBase.Diaries;
import com.example.mybali.RoomDataBase.DiariesDao;

@Database(entities = {Diaries.class},version = 1,exportSchema = true)
public abstract class DiariesDatabase extends RoomDatabase {
    public static final String DB_Name = "Diaries.db";
    private static volatile DiariesDatabase instance;

    public static synchronized DiariesDatabase getInstance(Context context){
        if (instance == null){
            instance = create(context);
        }
        return instance;
    }

    private static DiariesDatabase create(final Context context){
        return Room.databaseBuilder(context,DiariesDatabase.class,DB_Name).build();
    }

    public abstract DiariesDao getDiariesDao();
}
