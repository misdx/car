package com.dkl.service.product.impl;

import com.dkl.dao.carproduct.BrowsingMapping;
import com.dkl.enums.ResultEnum;
import com.dkl.exception.CarException;
import com.dkl.pojo.Browsing;
import com.dkl.service.product.BrowsingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class BrowsingServiceImpl implements BrowsingService {

    @Autowired
    private BrowsingMapping browsingMapping;

    @Override
    @Transactional
    public void browsingAdd(Browsing browsing) {
        if (browsing == null) {
            log.error("【浏览新增】新增失败，没有数据传递,browsing={}", browsing);
            throw new CarException(ResultEnum.BROWSING_ADD_ERROR);
        }
        if (browsingMapping.browsingAdd(browsing) <= 0) {
            log.error("【浏览新增】新增失败，没有通过sql语句");
        }
    }

    @Override
    @Transactional
    public void browsingClear(Browsing browsing) {
        if (browsing == null) {
            log.error("【浏览删除】删除失败，没有数据传递,browsing={}", browsing);
            throw new CarException(ResultEnum.BROWSING_DELETE_ERROR);
        }
        System.out.println(browsing);
        if (browsingMapping.browsingClear(browsing) <= 0) {
            log.error("【浏览新增】删除失败，没有通过sql语句");
            throw new CarException(ResultEnum.BROWSING_DELETE_ERROR);
        }
    }

    @Override
    public int findBrowsingClearId(Integer userId) {
        return browsingMapping.findBrowsingClearId(userId);
    }

    @Override
    public int findBrowsingUserId(Integer userId,String productId) {
        return browsingMapping.findBrowsingUserId(userId,productId);
    }
}
