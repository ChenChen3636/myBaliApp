package com.example.mybali.RoomDataBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DiaryDao {

    String tableName = "DiaryTable";
    /*============================================================================================*/
    //新增資料
    @Insert(onConflict = OnConflictStrategy.REPLACE)//預設萬一執行出錯怎麼辦，REPLACE為覆蓋
    void insertData(Diary diaries);
    //更新資料
    @Update
    void updateData(Diary diaries);
    //刪除資料
    @Delete
    void deleteData(Diary diaries);
    //清空
    @Query("DELETE FROM " + tableName)
    void deleteAllScore();
    //撈取全部資料
    @Query("SELECT * FROM " + tableName)
    List<Diary> displayAll();

}
