package com.dkl.service.product;

import com.dkl.pojo.ProductArea;

import java.util.List;

public interface ProductAreaService {
    // 查询所有产地
    List<ProductArea> findProductAreaList();

    // 根据 商品表来查询产地
    ProductArea findByProductAreaOne(Integer areaId);
}
