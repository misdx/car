package com.dkl.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 浏览记录
 */
@Data
public class Browsing {
    // 浏览id
    private Integer browsingId;
    // 商品id
    private String productId;
    // 用户id
    private Integer userId;
    // 创建时间
    private Date createTime;

    public Browsing(String productId, Integer userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public Browsing(Integer browsingId, Integer userId) {
        this.browsingId = browsingId;
        this.userId = userId;
    }

    public Browsing() {
    }
}
