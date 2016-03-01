package com.study.fuli.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.study.fuli.data.DataManager;
import com.study.fuli.event.EventButtGirlGot;

import org.greenrobot.eventbus.Subscribe;

/**
 * Created by hsy on 2016/2/22.
 */
public class FragPageButt extends BaseFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataManager.getInstance().getButtGirls(1);
    }

    @Subscribe
    public void onEvent(EventButtGirlGot eventButtGirlGot) {
    }
}
