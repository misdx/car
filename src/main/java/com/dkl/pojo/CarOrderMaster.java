package com.dkl.pojo;

import com.dkl.enums.car.CarOrderStatusEnum;
import com.dkl.enums.car.CarPayMethodEnum;
import com.dkl.enums.car.CarPayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 */
@Data
public class CarOrderMaster {
    // 汽车订单表
    private String carOrderId;
    // 买家名字
    private String carUserName;
    // 买家手机
    private String carUserPhone;
    // 买家id
    private Integer carUserId;
    // 订单总金额
    private BigDecimal carOrderAmount;
    // 订单状态
    private Integer carOrderStatus = CarOrderStatusEnum.NEW.getCode();
    // 支付状态
    private Integer carPayStatus = CarPayStatusEnum.WAIT.getCode();
    // 支付方式
    private Integer carPayMethod = CarPayMethodEnum.ON_LINE.getCode();
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date updateTime;
}