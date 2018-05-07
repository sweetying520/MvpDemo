package com.dream.mvpdemo.base;

import com.dream.mvpdemo.model.DataManager;

/**BasePresenter
 * Created by Administrator on 2018/5/7.
 */

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    protected DataManager mDataManager;
    protected V mView;

     public BasePresenter(){
         mDataManager = new DataManager();
    }

    @Override
    public void attachView(V view) {
        this.mView = view;
    }
}
