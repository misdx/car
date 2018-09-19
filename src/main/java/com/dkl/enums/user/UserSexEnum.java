package com.dkl.enums.user;

import lombok.Getter;

/**
 * 用户性别状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum UserSexEnum {
    MAN(0, "男"),
    WOMAN(1, "女"),;

    private Integer code;
    private String msg;

    UserSexEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
