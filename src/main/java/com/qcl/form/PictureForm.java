package com.qcl.form;

import java.util.Date;

import lombok.Data;

/**
 * 编程小石头：2501902696（微信）
 */
@Data
public class PictureForm {

    private Integer picId;
    private String picUrl;
    private String picMessage;
    private Date picCreate;
}
