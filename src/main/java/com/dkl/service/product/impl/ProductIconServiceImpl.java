package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.ProductIconMapping;
import com.dkl.pojo.ProductIcon;
import com.dkl.service.product.ProductIconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductIconServiceImpl implements ProductIconService {

    @Autowired
    private ProductIconMapping productIconMapping;

    @Override
    public List<ProductIcon> findProductIconList(String productId) {
        return productIconMapping.findProductIconList(productId);
    }
}
