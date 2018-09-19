package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductArea;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductAreaMappingTest {

    @Autowired
    private ProductAreaMapping productAreaMapping;

    @Test
    public void findProductAreaList() {
        productAreaMapping.findProductAreaList().forEach(i -> System.out.println(i));
    }
}