package com.qcl.utils;

import com.qcl.enums.CodeEnum;

/**
 * 编程小石头：2501902696（微信）
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
