package com.dkl.converter;

import com.dkl.pojo.ProductInfo;
import com.dkl.vo.ProductListVO;
import com.github.pagehelper.Page;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * page 转换成 Map
 */
@Slf4j
public class PageHelper2JacksonConverter {

    public static Map<String,Object> converter(Page<ProductInfo> page){
        Map<String,Object> map = new HashMap<>();
        map.put("totalCount",page.getPages());// 总页数
        map.put("currPageNo",page.getPageNum());// 当前页码
        map.put("pageSize",page.getPageSize());// 每页数量
        map.put("totalPageCount",page.getTotal());// 总数据量
        map.put("pageList",page);
        return map;
    }
}
