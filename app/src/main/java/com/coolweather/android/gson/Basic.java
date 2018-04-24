package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 21:04
 * <p>
 * 作用：xxx
 */

public class Basic {
    // @SerializedName注解方法让json子段与java建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
