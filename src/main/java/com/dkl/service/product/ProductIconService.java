package com.dkl.service.product;

import com.dkl.pojo.ProductIcon;

import java.util.List;

public interface ProductIconService {
    // 根据商品id查询对应的图片
    List<ProductIcon> findProductIconList(String productId);
}
