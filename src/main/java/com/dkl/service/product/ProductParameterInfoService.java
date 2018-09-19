package com.dkl.service.product;

import com.dkl.pojo.ProductParameterInfo;

public interface ProductParameterInfoService {

    // 根据车辆id 来查询车辆的基本信息
    ProductParameterInfo findProductParameterInfoOne( Integer cpiId);
}
