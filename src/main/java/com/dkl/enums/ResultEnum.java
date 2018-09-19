package com.dkl.enums;

import lombok.Getter;

/**
 * 自定义异常枚举
 */
@Getter
public enum ResultEnum {
    PARAMETERINFO_NOT_EXIST(0,"没有查询到基本信息"),
    PRODUCTAREA_NOT_EXIST(1,"没有查询到车辆产地"),
    PRODUCTMODEL_NOT_EXIST(2,"没有查询到车辆车型"),
    PRODUCTBRAND_NOT_EXIST(3,"没有查询到车辆品牌"),
    PRODUCTINFO_NOT_EXIST(4,"没有查询到车辆信息"),
    BROWSING_ADD_ERROR(5,"浏览添加失败"),
    BROWSING_DELETE_ERROR(5,"浏览删除失败"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
