package com.dream.mvpdemo.contract;

import com.dream.mvpdemo.base.IBasePresenter;
import com.dream.mvpdemo.base.IBaseView;

/**MainContract
 * Created by Administrator on 2018/5/7.
 */

public interface MainContract {

    interface View extends IBaseView{
        void testGetMview();
    }

    interface Presenter extends IBasePresenter<View>{
        void testGetMpresenter();

        void testDb();

        void testRequestNetwork();

        void testPreference();

    }
}
