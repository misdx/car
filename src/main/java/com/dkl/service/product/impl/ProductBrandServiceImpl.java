package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.ProductAreaMapping;
import com.dkl.dao.carproduct.ProductBrandMapping;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.ProductArea;
import com.dkl.pojo.ProductBrand;
import com.dkl.service.product.ProductAreaService;
import com.dkl.service.product.ProductBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productBrandService")
@Slf4j
public class ProductBrandServiceImpl implements ProductBrandService {

    @Autowired
    private ProductBrandMapping productBrandMapping;

    @Override
    public List<ProductBrand> findProductBrandList() {
        //return productBrandMapping.findProductBrandList();
        return null;
    }

    @Override
    public ProductBrand findBrandIdAndBrandIcon(Integer brandId) {
        ProductBrand brandIdAndBrandIcon = productBrandMapping.findBrandIdAndBrandIcon(brandId);
        if (brandIdAndBrandIcon == null) {
            log.error("【查询品牌】,没有查询到该品牌,brandId={}", brandId);
            throw new CarException(ResultEnum.PRODUCTBRAND_NOT_EXIST);
        }
        System.out.println("我是品牌图片" + brandIdAndBrandIcon.getBrandIcon());
        return brandIdAndBrandIcon;
    }
}
