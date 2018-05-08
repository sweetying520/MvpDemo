package com.dream.mvpdemo.model.db;

import android.util.Log;

/**
 * Created by Administrator on 2018/5/8.
 */

public class DbHelper implements AppDbHelper{
    @Override
    public void testDb() {
        Log.d("print", "数据库操作");
    }
}
