package com.qcl.aspect;

import com.qcl.constant.CookieConstant;
import com.qcl.exception.SellerAuthorizeException;
import com.qcl.utils.CookieUtil;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * 编程小石头：2501902696（微信）
 */
@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {


    //    @Pointcut("execution(public * com.qcl.controller.Seller*.*(..))" +
    //    "&& !execution(public * com.qcl.controller.SellerUserController.*(..))")
    @Pointcut("execution(public * com.qcl.controller.Seller*.*(..))")
    public void verify() {
    }

    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //查询cookie
        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
        if (cookie == null) {
            log.warn("【登录校验】Cookie中查不到token");
            throw new SellerAuthorizeException();
        }
    }
}
