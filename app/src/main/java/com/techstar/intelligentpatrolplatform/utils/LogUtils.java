package com.techstar.intelligentpatrolplatform.utils;

import android.util.Log;

import com.techstar.intelligentpatrolplatform.BuildConfig;

public class LogUtils {
    /**
     * 日志输出级别NONE
     */
    public static final int LEVEL_NONE = 0;
    /**
     * 日志输出级别V
     */
    public static final int LEVEL_VERBOSE = 1;
    /**
     * 日志输出级别D
     */
    public static final int LEVEL_DEBUG = 2;
    /**
     * 日志输出级别I
     */
    public static final int LEVEL_INFO = 3;
    /**
     * 日志输出级别W
     */
    public static final int LEVEL_WARN = 4;
    /**
     * 日志输出级别E
     */
    public static final int LEVEL_ERROR = 5;

    /**
     * 日志输出时的TAG
     */
    private static String mTag = "LogUtil";
    /**
     * 是否允许输出log
     */
    private static int mDebuggable = LEVEL_NONE;

    /**
     * 用于记时的变量
     */
    private static long mTimestamp = LEVEL_ERROR;
    /**
     * 写文件的锁对象
     */
    private static final Object mLogLock = new Object();

    /**
     * 以级别为 d 的形式输出LOG
     */
    public static void v(String msg) {
//        if (mDebuggable >= LEVEL_VERBOSE) {
//            Log.v(mTag, msg);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.v(mTag, msg);
        }
    }

    /**
     * 以级别为 d 的形式输出LOG
     */
    public static void d(String msg) {
//        if (mDebuggable >= LEVEL_DEBUG) {
//            Log.d(mTag, msg);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.d(mTag, msg);
        }
    }

    /**
     * 以级别为 i 的形式输出LOG
     */
    public static void i(String msg) {
//        if (mDebuggable >= LEVEL_INFO) {
//            Log.i(mTag, msg);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.i(mTag, msg);
        }
    }

    /**
     * 以级别为 w 的形式输出LOG
     */
    public static void w(String msg) {
//        if (mDebuggable >= LEVEL_WARN) {
//            Log.w(mTag, msg);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.w(mTag, msg);
        }
    }

    /**
     * 以级别为 w 的形式输出Throwable
     */
    public static void w(Throwable tr) {
//        if (mDebuggable >= LEVEL_WARN) {
//            Log.w(mTag, "", tr);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.w(mTag, "", tr);
        }
    }

    /**
     * 以级别为 w 的形式输出LOG信息和Throwable
     */
    public static void w(String msg, Throwable tr) {
//        if (mDebuggable >= LEVEL_WARN && null != msg) {
//            Log.w(mTag, msg, tr);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.w(mTag, msg, tr);
        }
    }

    /**
     * 以级别为 e 的形式输出LOG
     */
    public static void e(String msg) {
//        if (mDebuggable >= LEVEL_ERROR) {
//            Log.e(mTag, msg);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.e(mTag, msg);
        }
    }

    /**
     * 以级别为 e 的形式输出Throwable
     */
    public static void e(Throwable tr) {
//        if (mDebuggable >= LEVEL_ERROR) {
//            Log.e(mTag, "", tr);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.e(mTag, "", tr);
        }
    }

    /**
     * 以级别为 e 的形式输出LOG信息和Throwable
     */
    public static void e(String msg, Throwable tr) {
//        if (mDebuggable >= LEVEL_ERROR && null != msg) {
//            Log.e(mTag, msg, tr);
//        }
        if (BuildConfig.LOG_DEBUG) {
            Log.e(mTag, msg, tr);
        }
    }
}
