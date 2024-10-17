package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;

public class Meta extends SuperDomain {
    private String title;//菜单title

    //省略get/set方法


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
