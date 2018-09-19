package com.dkl.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CarOrderDetail {
    // 汽车的订单详情
    private String carDetailId;
    // 订单id
    private String carOrderId;
    // 商品id
    private String carProductId;
    // 商品名称
    private String carProductName;
    // 商品单价
    private BigDecimal carProductPrice;
    // 商品数量
    private Integer carProductQuantity;
    // 商品图片
    private String carProductIcon;
    // 汽车外部颜色
    private Integer carProductColor;
    // 汽车内部的颜色
    private Integer carProductTrim;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date updateTime;

}