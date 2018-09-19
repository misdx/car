package com.dkl.service.product.impl;

import com.github.pagehelper.Page;
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
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findPageMap() {
        /*Page<Map<String, Object>> pageMap = productInfoService.findPageMap(0, 5);
        System.out.println(pageMap.getPages());
        System.out.println(pageMap.getPageNum());
        System.out.println(pageMap.getPageSize());
        System.out.println(pageMap.getTotal());
        List<Map<String, Object>> result = pageMap.getResult();
        result.forEach(i -> {
            Set<String> strings = i.keySet();
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println("键：" + key + "值为：" + i.get(key));
            }
        });*/

    }
}