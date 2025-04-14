package com.openapi.biz.model.vo.interfaceinfo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 接口信息 分页查询结果
 *
 * @author sunnao
 * @since 2025-04-13
 */
@Data
public class InterfaceInfoPageVO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    private Long createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人ID
     */
    private Long updateBy;
}
