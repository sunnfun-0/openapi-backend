package com.openapi.common.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 基础分页请求对象
 *
 * @author sunnao
 * @since 2025-04-13
 */
@Data
public abstract class BasePageQuery implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int pageNum = 1;

    private int pageSize = 10;

    public <T> Page<T> buildPage() {
        return new Page<>(pageNum, pageSize);
    }

}
