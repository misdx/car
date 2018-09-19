package com.dkl.dao.carproduct;

import com.dkl.pojo.BrandLetter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandLetterMappingTest {

    @Autowired
    private BrandLetterMapping brandLetterMapping;

    @Test
    public void findBrandLetterList() {
        List<BrandLetter> brandLetterList = brandLetterMapping.findBrandLetterList();
        brandLetterList.forEach(i -> {
            System.out.println(i.getLetterName());
            i.getProductBrandList().forEach(j -> System.out.println(j));
        });
    }
}