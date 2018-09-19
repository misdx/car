package com.dkl.dao;

import com.dkl.dao.carproduct.ProductBrandMapping;
import com.dkl.pojo.ProductBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductBrandMappingTest {

    @Autowired
    private ProductBrandMapping productBrandMapping;

    @Test
    public void findProductBrandList() {
        /*List<ProductBrand> productBrandList = productBrandMapping.findProductBrandList();
        productBrandList.forEach(i -> {
            System.out.println(i);
        });*/

    }
}