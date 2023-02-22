package com.example.mybali.RoomDataBase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "MyDiaries")
public class Diaries {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "mood_score")
    private int score;

    @ColumnInfo(name = "activity_tag")
    private String tag;

    @ColumnInfo(name = "content")
    private String content;

    public Diaries(int score, String tag, String content){
        this.score = score;
        this.tag = tag;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        this.score = score;
    }

    public String getTag() {

        return tag;
    }

    public void setTag(String tag) {

        this.tag = tag;
    }
}
