package com.dream.mvpdemo.contract;

import com.dream.mvpdemo.base.IBasePresenter;
import com.dream.mvpdemo.base.IBaseView;

/**
 * Created by Administrator on 2018/5/7.
 */

public interface MainContract {

    interface View extends IBaseView{
        void testGetMpresenter();
    }

    interface Presenter extends IBasePresenter<View>{
        void testGetMview();
    }
}
