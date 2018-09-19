package com.dkl.converter;

import com.dkl.dto.CartDTO;
import com.google.gson.Gson;

public class String2CartDTOConverter {

    public static CartDTO converter(String json){
        Gson gson = new Gson();
        CartDTO cartDTO = gson.fromJson(json, CartDTO.class);
        return cartDTO;
    }
}
