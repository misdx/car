package com.dkl.vo;

import com.dkl.pojo.BrandLetter;
import com.dkl.pojo.ProductArea;
import com.dkl.pojo.ProductModel;
import lombok.Data;

import java.util.List;

@Data
public class ProductListVO<T> {

    private List<BrandLetter> brandLetterList;

    private List<ProductArea> productAreaList;

    private List<ProductModel> productModelList;

    private T pageObject;
}
