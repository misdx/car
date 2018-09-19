package com.dkl.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 品牌表
 */
@Data
public class ProductModel {
    @JsonProperty("id")
    private Integer modelId;
    // 品牌图片
    @JsonProperty("text")
    private String modelName;

    public ProductModel(Integer modelId, String modelName) {
        this.modelId = modelId;
        this.modelName = modelName;
    }

    public ProductModel() {
    }

    public ProductModel(String modelName) {
        this.modelName = modelName;
    }
}