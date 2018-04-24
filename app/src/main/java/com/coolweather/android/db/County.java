package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 16:30
 * <p>
 * 作用：存放县的数据信息
 */

public class County extends DataSupport{
    private int id;//每个实体类的字段
    private String countyName;//记录县的名字
    private String  weatherId;//记录县所在对应的天气id
    private int cityId;//记录当前县所属市的id值

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
