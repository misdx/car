package com.dkl.dao.carproduct;

import com.dkl.pojo.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoMappingTest {

    @Autowired
    private ProductInfoMapping productInfoMapping;

    @Test
    public void findProductInfoListMap() {
        List<ProductInfo> productInfoListMap = productInfoMapping.findProductInfoListMap();
        productInfoListMap.forEach(i -> System.out.println(i));
    }

    @Test
    public void findByProductInfoOne() {
        /*Map<String, Object> byProductInfoOne = productInfoMapping.findByProductInfoOne("1");
        Set<String> strings = byProductInfoOne.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("键：" + key + "值为：" + byProductInfoOne.get(key));
        }*/
    }
}