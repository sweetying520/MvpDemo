package com.dream.mvpdemo.presenter;

import android.util.Log;

import com.dream.mvpdemo.base.BasePresenter;
import com.dream.mvpdemo.contract.MainContract;

/**MainPresenter
 * Created by Administrator on 2018/5/7.
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{


    @Override
    public void testGetMpresenter() {
        Log.d("print", "我是P层的引用");
        mView.testGetMview();
    }

    @Override
    public void testDb() {
        mDataManager.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mDataManager.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mDataManager.testPreference();
    }
}
