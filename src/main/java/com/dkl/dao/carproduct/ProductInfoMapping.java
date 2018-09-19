package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProductInfoMapping {
    // 查询所有商品 分页
    List<ProductInfo> findProductInfoListMap();

    // 根据商品id 查询单个商品
    ProductInfo findByProductInfoOne(String productId);

    // 根据点击的品牌来查询车辆
    List<ProductInfo> findProductInfoBrandId(@Param("brandId") Integer brandId, @Param("productId") String productId);

    // 添加商品


}

