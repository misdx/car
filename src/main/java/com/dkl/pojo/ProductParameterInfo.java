package com.dkl.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductParameterInfo {
    private Integer cpiId;
    // 车型名称
    private String cpiModelname;
    // 引用公司id
    private Integer miId;
    // 发动机
    private String cpiEngine;
    // 车的长高宽(mm)
    private String cpiMm;
    // 轴距(mm)
    private Integer cpiWheel;
    // 行李箱容积(L)
    private Integer cpiCubage;
    // 整备质量(kg)
    private Integer cpiCurb;
    // 转向助力系统
    private String cpiSteering;
    // 最高车速(Km/h)
    private Integer cpiSpeed;
    // 加速时间0—100km/h(s)
    private BigDecimal cpiSpeedtime;
    // 平均油耗(L/100km)
    private BigDecimal cpiFuel;
    // 整车质保
    private String cpiQuality;
}