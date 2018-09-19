package com.dkl.pojo;

import lombok.Data;

/**
 * 商品图片
 */
@Data
public class ProductIcon {
    // 图片id
    private Integer iconId;
    // 图片路径
    private String iconPath;

    private String productId;
}