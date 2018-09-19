package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductAreaMapping {
    // 查询所有产地
    List<ProductArea> findProductAreaList();

    // 根据 商品表来查询产地
    ProductArea findByProductAreaOne(@Param("areaId") Integer areaId);
}
