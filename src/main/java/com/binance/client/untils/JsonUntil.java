package com.binance.client.untils;

import com.binance.client.impl.utils.JsonWrapper;

import java.math.BigDecimal;

public class JsonUntil {

    public static String getStringSafe(String name, JsonWrapper jsonWrapper) {

        String s = "";

        if (jsonWrapper.containKey(name)){
            s = jsonWrapper.getString(name);
        }

        return s;

    }
    public static BigDecimal getBigDecimalSafe(String name, JsonWrapper jsonWrapper) {

        BigDecimal s = new BigDecimal("0");

        if (jsonWrapper.containKey(name)){
            s = jsonWrapper.getBigDecimal(name);

        }

        return s;
    }
    public static Boolean getBooleanSafe(String name, JsonWrapper jsonWrapper) {
        boolean s = false;

        if (jsonWrapper.containKey(name)){
            s = jsonWrapper.getBoolean(name);
        }

        return s;

    }
    public static Long getLongSafe(String name, JsonWrapper jsonWrapper) {

        Long s = 0L;

        if (jsonWrapper.containKey(name)){
            s = jsonWrapper.getLong(name);
        }

        return s;
    }

}
