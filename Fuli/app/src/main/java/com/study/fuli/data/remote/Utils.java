package com.study.fuli.data.remote;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

/**
 * Created by hsy on 2016/2/22.
 */
public class Utils {
    public static ArrayList<String> parseWebPageImageUrl(String webPageContent) {
        ArrayList<String> urlsList = new ArrayList<String>();
        Document document = Jsoup.parse(webPageContent);
        Elements elements = document.select("div[class=thumbnail]>div[class=img_single]>a>img");
        for (Element e : elements) {
            String url = e.attr("src");
            urlsList.add(url);
        }
        return urlsList;
    }
}
