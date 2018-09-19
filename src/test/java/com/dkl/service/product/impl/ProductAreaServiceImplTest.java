package com.dkl.service.product.impl;

import com.dkl.pojo.ProductArea;
import com.dkl.service.product.ProductAreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductAreaServiceImplTest {

    @Autowired
    private ProductAreaService productAreaService;

    @Test
    public void findProductAreaList() {
        productAreaService.findProductAreaList().forEach(i -> System.out.println(i));

    }
}