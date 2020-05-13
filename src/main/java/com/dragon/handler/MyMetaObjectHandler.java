package com.dragon.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        // 获取到需要被填充的字段值
        Object byDate = getFieldValByName("createdDate", metaObject);
        Object byName = getFieldValByName("createdBy", metaObject);
        // 如果不手动设置，就自动填充默认值
        if (byDate == null) {
            this.setInsertFieldValByName("createdDate",new Date(), metaObject);
        }
        // 如果不手动设置，就自动填充默认值
        if (byName == null) {
            this.setInsertFieldValByName("createdBy", "admin", metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        this.setUpdateFieldValByName("updatedDate", LocalDateTime.now(), metaObject);
    }

}