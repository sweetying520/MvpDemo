package com.dream.mvpdemo.ui.activity;

import android.util.Log;

import com.dream.mvpdemo.R;
import com.dream.mvpdemo.base.BaseActivity;
import com.dream.mvpdemo.contract.MainContract;
import com.dream.mvpdemo.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initView() {
        mPresenter.testGetMpresenter();
        mPresenter.testDb();
        mPresenter.testRequestNetwork();
        mPresenter.testPreference();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void testGetMview() {
        Log.d("print", "我是V层的引用");
    }
}
