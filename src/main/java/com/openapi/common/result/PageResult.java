package com.openapi.common.result;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页响应结构体
 *
 * @author sunao
 * @since 2025-04-13
 */
@Data
public class PageResult<T> implements Serializable {

    private String code;

    private PageData<T> data;

    private String msg;

    public static <T> PageResult<T> success(IPage<T> page) {
        PageResult<T> result = new PageResult<>();
        result.setCode(ResultCode.SUCCESS.getCode());

        PageData<T> data = new PageData<>();
        data.setList(page.getRecords());
        data.setTotal(page.getTotal());

        result.setData(data);
        result.setMsg(ResultCode.SUCCESS.getMsg());
        return result;
    }

    @Data
    public static class PageData<T> {

        private List<T> list;

        private long total;

    }

}
