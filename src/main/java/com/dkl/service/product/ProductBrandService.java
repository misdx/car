package com.dkl.service.product;

import com.dkl.pojo.ProductBrand;

import java.util.List;

public interface ProductBrandService {

    // 查询所有的品牌
    List<ProductBrand> findProductBrandList();

    // 根据点击的商品品牌查询该品牌其他的车辆
    ProductBrand findBrandIdAndBrandIcon(Integer brandId);
}
