package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：陈俊伟 on 2018/4/22 0022 16:11
 * <p>
 * 作用：存放省的数据信息
 */

/**
 * LitePal中的每一个实体类都必须继承自DataSupport类
 */
public class province extends DataSupport{
    private int id;//每个实体类的字段
    private String provinceName;//记录省的名字
    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
