package com.dkl.dao.order;

import com.dkl.pojo.CarOrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class CarOrderMasterMappingTest {

    @Autowired
    private CarOrderMasterMapping carOrderMasterMapping;

    @Test
    public void carOrderMasterAdd() {
        CarOrderMaster carOrderMaster = new CarOrderMaster();
        carOrderMaster.setCarOrderAmount(new BigDecimal(1000));
        carOrderMaster.setCarOrderId("1");
        carOrderMaster.setCarUserId(1);
        carOrderMaster.setCarUserName("邓鑫");
        carOrderMaster.setCarUserPhone("15773451605");
        carOrderMasterMapping.carOrderMasterAdd(carOrderMaster);
    }
}