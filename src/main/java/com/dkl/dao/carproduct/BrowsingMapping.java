package com.dkl.dao.carproduct;

import com.dkl.pojo.Browsing;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrowsingMapping {

    // 添加浏览记录
    int browsingAdd(@Param("browsing") Browsing browsing);
    // 删除浏览记录
    int browsingClear(@Param("browsing")Browsing browsing);
    // 查询需要查询的id
    int findBrowsingClearId(@Param("userId")Integer userId);

    // 查询某个用户下是否有某个浏览记录
    int findBrowsingUserId(@Param("userId") Integer userId,@Param("productId") String productId);


}
