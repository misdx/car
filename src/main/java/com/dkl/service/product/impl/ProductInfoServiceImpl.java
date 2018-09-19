package com.dkl.service.product.impl;

import com.dkl.converter.PageHelper2JacksonConverter;
import com.dkl.dao.carproduct.ProductInfoMapping;
import com.dkl.vo.ProductVO;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.*;
import com.dkl.service.product.*;
import com.dkl.vo.ProductListVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("productInfoService")
@Slf4j
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapping productInfoMapping;

    // 引用品牌字母表业务逻辑
    @Autowired
    private BrandLetterService brandLetterService;
    // 引用品牌业务
    @Autowired
    private ProductBrandService productBrandService;
    // 引用车型业务逻辑
    @Autowired
    private ProductModelService productModelService;
    // 引用产地业务逻辑
    @Autowired
    private ProductAreaService productAreaService;
    // 引用基本信息表的业务逻辑
    @Autowired
    private ProductParameterInfoService productParameterInfoService;
    // 引用图片表的业务逻辑
    @Autowired
    private ProductIconService productIconService;

    @Override
    public ProductListVO<Map<String, Object>> findPageMap(Integer currPageNo, Integer pageSize) {
        // 用来封装值
        ProductListVO<Map<String, Object>> productListVO = new ProductListVO<>();
        // 分页
        PageHelper.startPage(currPageNo, pageSize);

        Page<ProductInfo> page = (Page<ProductInfo>) productInfoMapping.findProductInfoListMap();

        // 调用converter 方法
        Map<String, Object> converter = PageHelper2JacksonConverter.converter(page);


        // 给封装类赋值
        productListVO.setProductAreaList(productAreaService.findProductAreaList());

        productListVO.setPageObject(converter);

        productListVO.setBrandLetterList(brandLetterService.findBrandLetterList());

        productListVO.setProductModelList(productModelService.findProductModelList());


        return productListVO;
    }

    @Override
    public ProductVO findByProductInfoOne(String productId) {
        ProductVO productVO = new ProductVO();
        // 首先查询车辆信息
        ProductInfo productInfoOne = productInfoMapping.findByProductInfoOne(productId);
        if (productInfoOne == null) {
            log.error("【车辆信息】找不到该车辆信息,productId={}", productId);
            throw new CarException(ResultEnum.PRODUCTINFO_NOT_EXIST);
        }
        System.out.println(productInfoOne);
        // 查询品牌
        ProductBrand brandIdAndBrandIcon = productBrandService.findBrandIdAndBrandIcon(productInfoOne.getBrandId());
        // 查询产地
        ProductArea productAreaOne = productAreaService.findByProductAreaOne(productInfoOne.getAreaId());
        // 查询车型
        String productModelName = productModelService.findProductModelName(productInfoOne.getModelId());
        // 查询车辆的基本信息
        ProductParameterInfo productParameterInfoOne = productParameterInfoService.findProductParameterInfoOne(productInfoOne.getCpiId());
        // 查询车辆的图片
        List<ProductIcon> productIconList = productIconService.findProductIconList(productInfoOne.getProductId());
        // 查询该车品牌的其他车辆
        List<ProductInfo> productInfoBrandList = findProductInfoBrandId(productInfoOne.getBrandId(), productInfoOne.getProductId());
        // 封装数据到DTO
        BeanUtils.copyProperties(productInfoOne, productVO);
        productVO.setProductModel(new ProductModel(productModelName));
        productVO.setProductBrand(brandIdAndBrandIcon);
        productVO.setProductArea(productAreaOne);
        productVO.setProductParameterInfo(productParameterInfoOne);
        productVO.setProductIconList(productIconList);
        productVO.setProductInfoList(productInfoBrandList);
        productVO.setProductInfoCount(productInfoBrandList.size());
        return productVO;
    }

    @Override
    public List<ProductInfo> findProductInfoBrandId(Integer brandId, String productId) {
        List<ProductInfo> productInfoBrandId = productInfoMapping.findProductInfoBrandId(brandId, productId);
        return productInfoBrandId;
    }
}
