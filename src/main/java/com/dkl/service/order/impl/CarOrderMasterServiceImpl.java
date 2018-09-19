package com.dkl.service.order.impl;

import com.dkl.pojo.CarOrderMaster;
import com.dkl.service.order.CarOrderMasterService;
import com.dkl.utils.keys.OrderMasterKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CarOrderMasterServiceImpl implements CarOrderMasterService {

    @Autowired
    private CarOrderMasterService carOrderMasterService;

    /**
     * 创建订单
     * @param carOrderMaster
     */
    @Override
    @Transactional
    public void CarOrderMasterAdd(CarOrderMaster carOrderMaster) {
        // 获取订单id
        String masterId = OrderMasterKey.getOrderMasterKey();
        if (carOrderMaster == null) {

        }
    }
}
