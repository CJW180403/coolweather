package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 21:08
 * <p>
 * 作用：xxx
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
