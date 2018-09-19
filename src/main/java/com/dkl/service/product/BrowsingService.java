package com.dkl.service.product;

import com.dkl.pojo.Browsing;

public interface BrowsingService {

    // 添加浏览记录
    void browsingAdd(Browsing browsing);

    // 删除浏览记录
    void browsingClear(Browsing browsing);

    // 查询需要查询的id
    int findBrowsingClearId(Integer userId);

    // 查询某个用户下是否有某个浏览记录
    int findBrowsingUserId(Integer userId, String productId);


}
