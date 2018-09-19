package com.dkl.dto;

import lombok.Data;

/**
 * 购物项传递的数据
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productColor;

    private Integer productTrim;

    private Integer productQuantity;

}
