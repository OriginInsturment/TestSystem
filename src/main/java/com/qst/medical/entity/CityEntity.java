package com.qst.medical.entity;

import com.qst.medical.domain.City;

public class CityEntity extends City {

    private Long total;

//省略get/set方法

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
