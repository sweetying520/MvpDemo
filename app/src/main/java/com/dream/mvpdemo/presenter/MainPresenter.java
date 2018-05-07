package com.dream.mvpdemo.presenter;

import android.util.Log;

import com.dream.mvpdemo.base.BasePresenter;
import com.dream.mvpdemo.contract.MainContract;

/**
 * Created by Administrator on 2018/5/7.
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{


    @Override
    public void testGetMview() {
        mDataManager.showDataManager();
        Log.d("print", "-->P层的引用");
        mView.testGetMpresenter();
    }
}
