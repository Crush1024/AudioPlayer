package com.destiny.daudioolayer.application;

import android.app.Application;
import android.content.Intent;

import com.destiny.daudioolayer.db.DBManager;
import com.destiny.daudioolayer.service.PlayService;


/**
 * 自定义Application
 * Created by wcy on 2015/11/27.
 */
public class MusicApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppCache.get().init(this);
        ForegroundObserver.init(this);
        DBManager.get().init(this);

        Intent intent = new Intent(this, PlayService.class);
        startService(intent);
    }
}
