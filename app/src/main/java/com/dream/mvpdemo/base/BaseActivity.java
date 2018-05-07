package com.dream.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**BaseActivity
 * Created by Administrator on 2018/5/7.
 */

public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView{

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        //初始化mPresenter
        initPresenter();
        if(mPresenter != null){
            mPresenter.attachView(this);
        }

        //初始化
        initView();
    }




    /**
     * 初始化mPresenter
     */
    protected abstract void initPresenter();

    /**
     * 初始化
     */
    protected abstract void initView();

    /**
     * 获取布局id
     * @return
     */
    protected abstract int getLayoutId();
}
