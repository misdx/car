package com.dkl.enums.user;

import lombok.Getter;

/**
 * 用户状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum UserStartEnum {

    START(0, "启用"),
    NOT_START(1, "禁用"),;

    private Integer code;
    private String msg;

    UserStartEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
