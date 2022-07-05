package com.qcl.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 编程小石头：2501902696（微信）
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
