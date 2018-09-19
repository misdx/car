package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.ProductParameterInfoMapping;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.ProductParameterInfo;
import com.dkl.service.product.ProductParameterInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductParameterInfoServiceImpl implements ProductParameterInfoService {

    @Autowired
    private ProductParameterInfoMapping productParameterInfoMapping;

    @Override
    public ProductParameterInfo findProductParameterInfoOne(Integer cpiId) {
        ProductParameterInfo productParameterInfoOne = productParameterInfoMapping.findProductParameterInfoOne(cpiId);
        if (productParameterInfoOne == null) {
            log.error("【车辆基本信息查询】没有查询该车辆信息,cpiId={}", cpiId);
            throw new CarException(ResultEnum.PARAMETERINFO_NOT_EXIST);
        }
        return productParameterInfoOne;
    }
}
