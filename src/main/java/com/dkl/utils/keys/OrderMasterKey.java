package com.dkl.utils.keys;

import java.util.UUID;

/**
 * 订单表的主键生成策略
 */
public class OrderMasterKey {

    public static String getOrderMasterKey(){
        return UUID.randomUUID().toString().substring(0,6)+System.currentTimeMillis();
    }
}
