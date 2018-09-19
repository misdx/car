package com.dkl.dao.order;

import com.dkl.pojo.CarOrderDetail;
import org.apache.ibatis.annotations.Param;

public interface CarOrderDetailMapping {

    int carOrderDetailAdd(@Param("detail") CarOrderDetail carOrderDetail);
}
