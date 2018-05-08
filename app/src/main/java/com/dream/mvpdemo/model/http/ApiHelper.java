package com.dream.mvpdemo.model.http;

import android.util.Log;

/**
 * Created by Administrator on 2018/5/8.
 */

public class ApiHelper implements AppApiHelper{

    @Override
    public void testRequestNetwork() {
        Log.d("print", "网络请求操作");
    }
}
