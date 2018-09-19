package com.dkl.enums.user;

import lombok.Getter;

/**
 * 用户身份状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum UserTypeEnum {
    ADMIN(0, "管理员"),
    COMMON(1, "普通用户"),
    VIP(2, "会员用户"),;

    private Integer code;
    private String msg;

    UserTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
