package com.qcl.handler;

import com.qcl.config.ProjectUrlConfig;
import com.qcl.exception.SellerAuthorizeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 编程小石头：2501902696（微信）
 */
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    //http://localhost:8080/sell/seller/category/list
    //http://localhost:8080/sell/wechat/qrAuthorize?returnUrl=http://sell.natapp4.cc/sell/seller/login
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        //        return new ModelAndView("redirect:"
        //                .concat(projectUrlConfig.getWechatOpenAuthorize())
        //                .concat("/sell/wechat/qrAuthorize")
        //                .concat("?returnUrl=")
        //                .concat(projectUrlConfig.getSell())
        //                .concat("/sell/seller/login"));
        return new ModelAndView("common/loginView");
        //        return new ModelAndView("redirect:" + projectUrlConfig.getSell() + "/sell/seller/order/list");
    }
}
