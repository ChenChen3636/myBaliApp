package com.example.mybali;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Diary {

    private Context context;
    private SimpleDateFormat dateFormat;

    public Diary(Context context,SimpleDateFormat dateFormat){

        this.context = context;
        this.dateFormat = dateFormat;

    }
}
