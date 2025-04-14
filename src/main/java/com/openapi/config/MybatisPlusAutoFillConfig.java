package com.openapi.config;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

// java example
@Slf4j
@Component
public class MybatisPlusAutoFillConfig implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        try {
            this.strictInsertFill(metaObject, "createBy", Long.class, StpUtil.getLoginId(-1L));
            this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        } catch (Exception e) {
            log.error("mybatis plus insert auto fill error", e);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        try {
            this.strictUpdateFill(metaObject, "updateBy", Long.class, StpUtil.getLoginId(-1L));
            this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        } catch (Exception e) {
            log.error("mybatis plus update auto fill error", e);
        }
    }
}