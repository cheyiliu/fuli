package com.study.fuli.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.study.fuli.model.ModelChest;
import com.study.fuli.model.ModelStockings;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

/**
 * Created by hsy on 2016/2/22.
 */
public class FragPageStockings extends BaseFragment {

    @Subscribe
    public void onEvent(ArrayList<ModelStockings> modelStockings) {
    }
}
