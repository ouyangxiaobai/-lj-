package com.qcl.dataobject;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * 编程小石头：2501902696（微信）
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
public class Picture {

    @Id
    @GeneratedValue
    private Integer picId;
    private String picUrl;
    private String picMessage;
    private Date picCreate;
}
