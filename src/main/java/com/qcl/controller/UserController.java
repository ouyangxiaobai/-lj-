package com.qcl.controller;

import com.qcl.VO.ResultVO;
import com.qcl.dataobject.User;
import com.qcl.enums.ResultEnum;
import com.qcl.exception.SellException;
import com.qcl.form.UserForm;
import com.qcl.repository.UserRepository;
import com.qcl.utils.ResultVOUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户相关
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserRepository repository;

    //创建订单
    @PostMapping("/save")
    public ResultVO create(@Valid UserForm userForm,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("参数不正确, userForm={}", userForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        User userOld = repository.findByOpenid(userForm.getOpenid());
        User user = new User();
        if (userOld != null) {
            user.setId(userOld.getId());
        }
        user.setUsername(userForm.getUsername());
        user.setOpenid(userForm.getOpenid());
        user.setPhone(userForm.getPhone());
        user.setZhuohao(userForm.getZhuohao());
        user.setRenshu(userForm.getRenshu());

        return ResultVOUtil.success(repository.save(user));
    }

    @GetMapping("/getUserInfo")
    public ResultVO getUserInfo(@RequestParam("openid") String openid) {
        User user = repository.findByOpenid(openid);
        return ResultVOUtil.success(user);
    }

}
