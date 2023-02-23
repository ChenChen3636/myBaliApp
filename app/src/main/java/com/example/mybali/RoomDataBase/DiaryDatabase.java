package com.example.mybali.RoomDataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Diary.class},version = 1,exportSchema = true)
public abstract class DiaryDatabase extends RoomDatabase {
    public abstract DiaryDao getDiaryDao();
}
