package com.openapi.biz.model.dto.interfaceinfo;

import com.openapi.common.base.BasePageQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息 分页查询参数
 *
 * @author sunnao
 * @since 2025-04-13
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class InterfaceInfoPageParamDTO extends BasePageQuery {

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;
}
