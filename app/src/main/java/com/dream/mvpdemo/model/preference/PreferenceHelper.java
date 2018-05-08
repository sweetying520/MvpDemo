package com.dream.mvpdemo.model.preference;

import android.util.Log;

/**
 * Created by Administrator on 2018/5/8.
 */

public class PreferenceHelper implements AppPreferenceHelper{

    @Override
    public void testPreference() {
        Log.d("print", "共享参数存储操作");
    }
}
