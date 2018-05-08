package com.dream.mvpdemo.base;

import com.dream.mvpdemo.model.DataManager;
import com.dream.mvpdemo.model.db.AppDbHelper;
import com.dream.mvpdemo.model.db.DbHelper;
import com.dream.mvpdemo.model.http.ApiHelper;
import com.dream.mvpdemo.model.http.AppApiHelper;
import com.dream.mvpdemo.model.preference.AppPreferenceHelper;
import com.dream.mvpdemo.model.preference.PreferenceHelper;

/**BasePresenter
 * Created by Administrator on 2018/5/7.
 */

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    protected DataManager mDataManager;
    protected V mView;

     public BasePresenter(){
         AppDbHelper appDbHelper = new DbHelper();
         AppPreferenceHelper appPreferenceHelper = new PreferenceHelper();
         AppApiHelper appApiHelper = new ApiHelper();
         mDataManager = new DataManager(appDbHelper, appApiHelper, appPreferenceHelper);
    }

    @Override
    public void attachView(V view) {
        this.mView = view;
    }
}
