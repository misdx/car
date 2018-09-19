package com.dkl.service.product;

import com.dkl.vo.ProductVO;
import com.dkl.pojo.ProductInfo;
import com.dkl.vo.ProductListVO;

import java.util.List;
import java.util.Map;

public interface ProductInfoService {
    // 查询所有
    ProductListVO<Map<String, Object>> findPageMap(Integer currPageNo, Integer pageSize);

    // 根据商品id 查询单个商品
    ProductVO findByProductInfoOne(String productId);

    // TODO 根据点击的品牌来查询车辆
    List<ProductInfo> findProductInfoBrandId(Integer brandId, String productId);
}
