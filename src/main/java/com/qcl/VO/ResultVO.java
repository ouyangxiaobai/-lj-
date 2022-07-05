package com.qcl.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * 编程小石头：2501902696（微信）
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
