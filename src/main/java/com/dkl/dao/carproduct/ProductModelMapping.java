package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductModelMapping {
    //查询所有车型
    List<ProductModel> findProductModelList();

    // 查询某个车辆的车型
    String findProductModelName(@Param("modelId") Integer modelId);
}
