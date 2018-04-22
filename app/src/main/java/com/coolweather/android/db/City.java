package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 16:29
 * <p>
 * 作用：存放市的数据信息
 */

public class City extends DataSupport{
    private int id;//每个实体类的字段
    private String cityName;//记录市的名字
    private int cityCode;//记录市的代号
    private int provinceId;//记录市当前所属省的id值

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
