package com.dkl.service.product;

import com.dkl.pojo.ProductModel;

import java.util.List;

public interface ProductModelService {

    //查询所有车型
    List<ProductModel> findProductModelList();

    // 查询某个车辆的车型
    String findProductModelName(Integer modelId);
}
