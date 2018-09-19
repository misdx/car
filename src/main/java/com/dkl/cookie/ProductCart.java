package com.dkl.cookie;

import com.dkl.dto.CartDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 */
public class ProductCart implements Serializable {

    // 商品结果集
    List<CartDTO> cartDTOList = new ArrayList<>();

    //添加购物项到购物车
    public void cartAdd(CartDTO cartDTO){
        // 判断List集合里面是否已经有了该对象
        if(cartDTOList.contains(cartDTO)) {
            cartDTOList.forEach(i -> {
                // 有了则添加数量
                if (i.getProductId().equals(cartDTO.getProductId())) {
                    i.setProductQuantity(i.getProductQuantity() + cartDTO.getProductQuantity());
                }
            });
        }else{
            // 没有则添加
            cartDTOList.add(cartDTO);
        }
    }
}
