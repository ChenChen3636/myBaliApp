package com.example.mybali.RoomDataBase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "DiaryTable")
public class Diary {

    public Diary(String title,String description,long createdTime){
        this.title = title;
        this.description = description;
        this.createdTime = createdTime;
    }

    @Ignore
    public Diary(int id,String title,String description,long createdTime){
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdTime = createdTime;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "createdTime")
    private long createdTime;

//-----------------getter and setter--------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }


}
