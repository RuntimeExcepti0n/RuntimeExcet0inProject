package com.dragon.Entity;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {

    private String createdBy;

    private String updateBy;

    private Date createdDate;

    private Date updatedDate;

    /**
     * 是否删除Y删除，N有效
     */
    private String isDelete = "N";
}
