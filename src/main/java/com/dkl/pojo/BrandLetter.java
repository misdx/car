package com.dkl.pojo;

import lombok.Data;

import java.util.List;

@Data
public class BrandLetter {
    private Integer letterId;

    private char letterName;

    List<ProductBrand> productBrandList;
}
