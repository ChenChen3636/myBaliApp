//package com.example.mybali;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import java.security.AccessControlContext;
//
//public class DiaryDB extends SQLiteOpenHelper {
//
//    private final static int _DBVersion = 1; //版本
//    private final static  String _DBName = "DiaryDB"; //database name
//    private final static  String _TableName = "Diaries"; //table name
//
//    private static final String C_TIME = "c_time";
//    private static final String C_PREVIEW_NOTE = "preview_note";
//    private static final String C_DIARY_CONTENT = "c_diary_content";
//
////    private static final String[] COLUMNS = new String[]{C_TIME,C_PREVIEW_NOTE,C_DIARY_CONTENT};
//    public DiaryDB(Context context) {
//        super(context, _DBName, null, _DBVersion);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String SqlTable = "CREATE TABLE IF NOT EXISTS " + _TableName + " (" +
//                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                "Mood_Score TEXT not null," +
//                "Diary_Content TEXT not null" +
//                ")";
//        db.execSQL(SqlTable);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oleVersion, int newVersion) {
//        final String SQL = "DROP TABLE IF EXISTS " + _TableName;
//        db.execSQL(SQL);
//    }
//
//}
