package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.ProductAreaMapping;
import com.dkl.dao.carproduct.ProductModelMapping;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.ProductArea;
import com.dkl.pojo.ProductModel;
import com.dkl.service.product.ProductAreaService;
import com.dkl.service.product.ProductModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productModelService")
@Slf4j
public class ProductModelServiceImpl implements ProductModelService {

    @Autowired
    private ProductModelMapping productModelMapping;

    @Override
    public List<ProductModel> findProductModelList() {
        return productModelMapping.findProductModelList();
    }

    @Override
    public String findProductModelName(Integer modelId) {
        System.out.println("findProductModelName:" + modelId);
        String productModelName = productModelMapping.findProductModelName(modelId);
        if (productModelName == null) {
            log.error("【查询车型】没有查询到该车辆车型,modelId={}", modelId);
            throw new CarException(ResultEnum.PRODUCTMODEL_NOT_EXIST);
        }
        return productModelName;
    }
}
