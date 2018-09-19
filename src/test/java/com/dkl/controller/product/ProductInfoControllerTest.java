package com.dkl.controller.product;

import com.dkl.vo.ProductVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoControllerTest {

    @Autowired
    private ProductInfoController productInfoController;

    @Test
    public void carOne() {
        //ProductVO productVO = productInfoController.carOne("13", 1,null);
        //System.out.println(productVO);
    }
}