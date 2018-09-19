package com.dkl.pojo;

import com.dkl.enums.product.ProductStatusEnum;
import com.dkl.utils.Money2Myriad;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

// 商品表

/**
 * @JsonSerialize : 使用自定义换算价格
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductInfo {
    // 商品id
    private String productId;
    // 商品标题
    private String productTitle;
    // 商品描述
    private String productDescribe;
    // 商品库存
    private Integer productStock;
    // 商品销量
    private Integer productSales;
    // 商品状态
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    // 单个商品图片
    private String productIcon;
    // 商品价格
    @JsonSerialize(using = Money2Myriad.class)
    private BigDecimal productPrice;
    // 商品定金
    private BigDecimal productEarnest;
    // 车身颜色
    private Integer productColor;
    // 内饰颜色
    private Integer productTrim;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date updateTime;

    private Integer brandId;

    private Integer areaId;

    private Integer modelId;

    private Integer cpiId;
}