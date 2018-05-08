package com.dream.mvpdemo.model;

import com.dream.mvpdemo.model.db.AppDbHelper;
import com.dream.mvpdemo.model.http.AppApiHelper;
import com.dream.mvpdemo.model.preference.AppPreferenceHelper;

/**DataManager
 * Created by Administrator on 2018/5/7.
 */

public class DataManager implements AppDbHelper,AppApiHelper,AppPreferenceHelper{
    private AppDbHelper mAppDbHelper;
    private AppApiHelper mAppApiHelper;
    private AppPreferenceHelper mAppPreferenceHelper;

    public DataManager(AppDbHelper mAppDbHelper, AppApiHelper appApiHelper, AppPreferenceHelper appPreferenceHelper) {
        this.mAppDbHelper = mAppDbHelper;
        this.mAppApiHelper = appApiHelper;
        this.mAppPreferenceHelper = appPreferenceHelper;
    }


    @Override
    public void testDb() {
        mAppDbHelper.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mAppApiHelper.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mAppPreferenceHelper.testPreference();
    }
}
