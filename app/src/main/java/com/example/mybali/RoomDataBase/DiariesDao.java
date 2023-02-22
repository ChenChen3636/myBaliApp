package com.example.mybali.RoomDataBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import com.example.mybali.Diary;
import com.google.android.material.color.utilities.Score;

@Dao //Database access object
public interface DiariesDao {

    String tableName = "MyDiaries";
    /*============================================================================================*/
    //新增資料
    @Insert(onConflict = OnConflictStrategy.REPLACE)//預設萬一執行出錯怎麼辦，REPLACE為覆蓋
    void insertData(Diaries diaries);
    //更新資料
    @Update
    void updateData(Diaries diaries);
    //刪除資料
    @Delete
    void deleteData(Diaries diaries);
    //清空
    @Query("DELETE FROM " + tableName)
    void deleteAllScore();
    //撈取全部資料
    @Query("SELECT * FROM "+ tableName)
    List<Diaries> displayAll();
}
