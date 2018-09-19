package com.dkl.utils.keys;

import java.util.Random;

/**
 * 短信验证码
 */
public class VerifyKey {

    public static int getVerifyKey(){
        Random rand = new Random();
        return rand.nextInt(9000)+1000;
    }
}
