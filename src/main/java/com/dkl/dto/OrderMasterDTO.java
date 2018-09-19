package com.dkl.dto;


import com.dkl.pojo.CarOrderDetail;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 数据传输对象   用于层与层之间的调用
 */
@Data
public class OrderMasterDTO {
    /**
     * 订单id.
     */
    private String carOrderId;
    /**
     * 买家名字.
     */
    private String carUserName;
    /**
     * 买家手机号.
     */
    private String carUserPhone;
    /**
     * 买家id.
     */
    private Integer carUserId;
    /**
     * 订单总金额.
     */
    private BigDecimal carOrderAmount;
    /**
     * 订单状态, 默认为0新下单.
     */
    private Integer carOrderStatus;

    /**
     * 支付状态, 默认为0未支付.
     */
    private Integer carPayStatus;

    /**
     * 创建时间.
     */
    //@JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间.
     */
    //@JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<CarOrderDetail> orderDetailList;
}
