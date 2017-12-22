package com.destiny.daudioolayer.status;

import android.app.Activity;

/**
 * Created: 2017/10/24 14:48
 *
 * @author ydy
 */

public interface IStatusBar {

    /**
     * ...
     *
     * @param activity        activity
     * @param isFontColorDark isFontColorDark
     */
    void setStatusBarLightMode(Activity activity, boolean isFontColorDark);

}
