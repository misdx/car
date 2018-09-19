package com.dkl.enums.product;

import lombok.Getter;

/**
 * 商品状态
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),;
    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
