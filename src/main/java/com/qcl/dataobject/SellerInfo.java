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
public class SellerInfo {

    @Id
    @GeneratedValue
    private Integer sellerId;

    private String username;

    private String password;

    private String phone;

    private Date createTime;

    private Date updateTime;
}
