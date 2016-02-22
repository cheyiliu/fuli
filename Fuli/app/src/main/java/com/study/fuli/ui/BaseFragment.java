package com.study.fuli.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.study.fuli.R;

/**
 * Created by hsy on 2016/2/22.
 */
public class BaseFragment extends Fragment {
    protected SwipeRefreshLayout mSRLayout;
    protected ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_base, container, false);
        mSRLayout = (SwipeRefreshLayout) root.findViewById(R.id.swiperefresh);
        mListView = (ListView) root.findViewById(R.id.list);
        return root;
    }
}
