package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.BrandLetterMapping;
import com.dkl.pojo.BrandLetter;
import com.dkl.service.product.BrandLetterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandLetterServiceImpl implements BrandLetterService {

    @Autowired
    private BrandLetterMapping brandLetterMapping;

    @Override
    public List<BrandLetter> findBrandLetterList() {
        return brandLetterMapping.findBrandLetterList();
    }
}
