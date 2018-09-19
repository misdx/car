package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductParameterInfo;
import org.apache.ibatis.annotations.Param;

public interface ProductParameterInfoMapping {
    // 根据车辆id 来查询车辆的基本信息
    ProductParameterInfo findProductParameterInfoOne(@Param("cpiId") Integer cpiId);
}
