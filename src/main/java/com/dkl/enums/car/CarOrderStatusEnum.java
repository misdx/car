package com.dkl.enums.car;

import lombok.Getter;

/**
 * 车辆订单状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum CarOrderStatusEnum {
    NEW(0,"新订单"),
    FINISHEN(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;
    private String msg;

    CarOrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
