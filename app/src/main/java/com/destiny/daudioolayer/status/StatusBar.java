package com.destiny.daudioolayer.status;

import android.app.Activity;
import android.os.Build;
import android.util.Log;

/**
 * Created: 2017/10/24 15:00
 *
 * @author ydy
 */

public class StatusBar {

    public static void applay(Activity activity, boolean isDarkFont) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            IStatusBar statusBar = null;
            if (OSUtils.isMeiZu()) {
                Log.i("TAG", "applay: " + "isMeiZu");
                statusBar = new MeizuStatusBar();
            } else if (OSUtils.isXiaoMi()) {
                Log.i("TAG", "applay: " + "isXiaoMi");
                statusBar = new MiuiStatusBar();
            } else if (OSUtils.isOSM()) {
                Log.i("TAG", "applay: " + "isOSM");
                statusBar = new OSMStatusBar();
            } else {
                Log.i("TAG", "applay: " + "都不是！！！");
            }
            if (statusBar != null) {
                statusBar.setStatusBarLightMode(activity, isDarkFont);
            }
        }
    }

}
