package com.dkl.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 *  产地
 *  @JsonProperty: 前台使用注解的值进行传值
 *                 后台使用原本的值进行传值
 */
@Data
public class ProductArea {
    // 产地id
    @JsonProperty("id")
    private Integer areaId;
    // 产地名字
    @JsonProperty("text")
    private String areaName;
}