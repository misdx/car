package com.dkl.utils.keys;

import java.util.UUID;

/**
 * 商品表主键生成
 */

public class ProductKey {

    public static String productKey() {
        return UUID.randomUUID().toString().substring(0, 6);
    }
}
