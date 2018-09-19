package com.dkl.pojo;

import lombok.Data;

/**
 * 品牌
 */
@Data
public class ProductBrand {
    // 品牌id
    private Integer brandId;
    // 品牌名称
    private String brandName;
    // 品牌图片
    private String brandIcon;
    // 品牌详情
    private String brandDescribe;
    // 字母的引用
    private Integer letterId;
}