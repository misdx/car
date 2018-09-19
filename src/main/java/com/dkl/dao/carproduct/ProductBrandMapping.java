package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductBrandMapping {
    // 根据字母来查询对应的品牌
    List<ProductBrand> findByProductBrand(@Param("letterId") Integer letterId);

    // TODO 查询单个品牌
    ProductBrand findBrandIdAndBrandIcon(@Param("brandId") Integer brandId);
}
