package com.dkl.vo;

import com.dkl.enums.product.ProductStatusEnum;
import com.dkl.pojo.*;
import com.dkl.utils.Money2Myriad;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 返回给 商品详情页面的
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductVO {

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
    // 商品颜色
    private Integer productColor;
    // 内饰
    private Integer productTrim;
    // 商品图片
    private String productIcon;
    // 商品价格
    @JsonSerialize(using = Money2Myriad.class)
    private BigDecimal productPrice;
    // 商品定金
    private BigDecimal productEarnest;
    // 品牌表
    private ProductBrand productBrand;
    // 产地表
    private ProductArea productArea;
    // 模型表
    private ProductModel productModel;
    // 基础信息表
    private ProductParameterInfo productParameterInfo;
    // 图片表
    private List<ProductIcon> productIconList;
    // 除了点击的所有该品牌商品
    private List<ProductInfo> productInfoList;
    // 种类
    private Integer productInfoCount;

    //TODO 等用户登录写完就可以删除了
    private UserInfo userInfo = new UserInfo(1,"邓鑫","12345678911");


}
