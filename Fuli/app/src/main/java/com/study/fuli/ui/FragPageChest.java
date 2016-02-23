package com.study.fuli.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.study.fuli.model.ModelButt;
import com.study.fuli.model.ModelChest;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

/**
 * Created by hsy on 2016/2/22.
 */
public class FragPageChest extends BaseFragment {

    @Subscribe
    public void onEvent(ArrayList<ModelChest> modelChests) {
    }
}
