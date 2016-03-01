package com.study.fuli.data;

import com.study.fuli.data.remote.ApiUrl;
import com.study.fuli.data.remote.Utils;
import com.study.fuli.event.EventButtGirlGot;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by hsy on 2016/2/22.
 */
public class DataManager {
    private static DataManager sInstance;
    private OkHttpClient mOkHttpClient = new OkHttpClient();

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

    public void getButtGirls(int page) {
        final Request request = new Request.Builder().url(ApiUrl.DouBanButtGirlUrl + page).build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // just post an empty result
                ArrayList<EventButtGirlGot> result = new ArrayList<EventButtGirlGot>();
                EventBus.getDefault().post(result);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseContent = response.body().string();
                ArrayList<String> buttGirlsUrls = Utils.parseWebPageImageUrl(responseContent);
                EventButtGirlGot eventButtGirlGot = new EventButtGirlGot();
                eventButtGirlGot.mPayload = buttGirlsUrls;
                EventBus.getDefault().post(eventButtGirlGot);
            }
        });
    }
}
