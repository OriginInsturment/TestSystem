package com.qst.medical.model;

import com.qst.medical.domain.Permission;

public class PermissionModel extends Permission {
    private MetaModel meta;//存放meta封装的各个属性，icon、title等

    //省略get/set方法


    public MetaModel getMeta() {
        return meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }
}
