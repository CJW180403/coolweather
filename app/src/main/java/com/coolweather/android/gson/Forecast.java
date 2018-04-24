package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 21:10
 * <p>
 * 作用：xxx
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
