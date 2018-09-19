package com.dkl.dao.order;

import com.dkl.pojo.CarOrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class CarOrderDetailMappingTest {

    @Autowired
    private CarOrderDetailMapping carOrderDetailMapping;

    @Test
    public void carOrderDetailAdd() {
        CarOrderDetail carOrderDetail = new CarOrderDetail();
        carOrderDetail.setCarDetailId("1");
        carOrderDetail.setCarOrderId("1");
        carOrderDetail.setCarProductIcon("1");
        carOrderDetail.setCarProductId("1");
        carOrderDetail.setCarProductName("宝马");
        carOrderDetail.setCarProductPrice(new BigDecimal(1000));
        carOrderDetail.setCarProductColor(1);
        carOrderDetail.setCarProductTrim(1);
        carOrderDetail.setCarProductQuantity(2);
        carOrderDetailMapping.carOrderDetailAdd(carOrderDetail);
    }
}