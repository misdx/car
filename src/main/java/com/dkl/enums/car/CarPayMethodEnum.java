package com.dkl.enums.car;

import lombok.Getter;

/**
 * 车辆支付方式
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum CarPayMethodEnum {
    ON_LINE(0,"在线支付"),
    CASH(1,"现金支付"),
    SWIPING(2,"刷卡支付"),
    ;
    private Integer code;
    private String msg;

    CarPayMethodEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
