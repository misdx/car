package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductIcon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductIconMapping {
    // 根据商品id查询对应的图片
    List<ProductIcon> findProductIconList(@Param("productId") String productId);
}
