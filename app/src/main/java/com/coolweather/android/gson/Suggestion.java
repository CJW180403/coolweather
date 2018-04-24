package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 21:09
 * <p>
 * 作用：xxx
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }
}
