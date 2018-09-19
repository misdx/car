package com.dkl.enums.car;

import lombok.Getter;

/**
 * 车辆支付状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum CarPayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;
    private String msg;

    CarPayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
