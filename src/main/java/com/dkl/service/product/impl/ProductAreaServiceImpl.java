package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.ProductAreaMapping;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.ProductArea;
import com.dkl.service.product.ProductAreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productAreaService")
@Slf4j
public class ProductAreaServiceImpl implements ProductAreaService {

    @Autowired
    private ProductAreaMapping productAreaMapping;

    @Override
    public List<ProductArea> findProductAreaList() {
        return productAreaMapping.findProductAreaList();
    }

    @Override
    public ProductArea findByProductAreaOne(Integer areaId) {
        ProductArea byProductAreaOne = productAreaMapping.findByProductAreaOne(areaId);
        if (byProductAreaOne == null) {
            log.error("【查询产地】该车没有查到产地,areaId={}", areaId);
            throw new CarException(ResultEnum.PRODUCTAREA_NOT_EXIST);
        }
        return byProductAreaOne;
    }
}
