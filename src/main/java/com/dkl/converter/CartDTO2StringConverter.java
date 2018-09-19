package com.dkl.converter;

import com.dkl.dto.CartDTO;
import com.google.gson.Gson;

public class CartDTO2StringConverter {

    public static String converter(CartDTO cartDTO){
        Gson gson = new Gson();
        return gson.toJson(cartDTO);
    }
}
