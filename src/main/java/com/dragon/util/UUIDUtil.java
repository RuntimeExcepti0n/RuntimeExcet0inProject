package com.dragon.util;

import java.util.UUID;

public class UUIDUtil {

    public static String getUUIDWithoutDash(){
        String uuid = UUID.randomUUID().toString().replace("-","").substring(0,32);
        return uuid;
    }
}
