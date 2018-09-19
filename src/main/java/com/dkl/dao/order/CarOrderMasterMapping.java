package com.dkl.dao.order;

import com.dkl.pojo.CarOrderMaster;
import org.apache.ibatis.annotations.Param;

public interface CarOrderMasterMapping {

    // 创建订单
    int carOrderMasterAdd(@Param("master") CarOrderMaster carOrderMaster);

}
