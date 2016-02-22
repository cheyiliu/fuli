package com.study.fuli.data;

/**
 * Created by hsy on 2016/2/22.
 */
public class DataManager {
    private static DataManager sInstance;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (sInstance == null) {
            synchronized (DataManager.class) {
                if (sInstance == null) {
                    sInstance = new DataManager();
                }
            }
        }
        return sInstance;
    }

    // add api here
}
