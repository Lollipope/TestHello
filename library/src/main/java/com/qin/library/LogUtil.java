package com.qin.library;

import android.util.Log;

/**
 * Created by asus on 2016/12/7.
 * 日志打印的工具类
 */

public class LogUtil {
    private static boolean isDebug = true;

    public static void v(String tag, String text) {
        if (isDebug) {
            Log.v(tag, text);
        }
    }

    public static void d(String tag, String text) {
        if (isDebug) {
            Log.d(tag, text);
        }
    }

    public static void v(Object object, String text) {
        if (isDebug) {
            Log.v(object.getClass().getSimpleName(), text);
        }
    }

    public static void d(Object object, String text) {
        if (isDebug) {
            Log.d(object.getClass().getSimpleName(), text);
        }
    }
}
