package com.dkl.service.order.impl;

import com.dkl.pojo.CarOrderDetail;
import com.dkl.service.order.CarOrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarOrderDetailServiceImpl implements CarOrderDetailService {

    @Autowired
    private CarOrderDetailService carOrderDetailService;

    @Override
    public void CarOrderDetailAdd(CarOrderDetail carOrderDetail) {

    }
}
