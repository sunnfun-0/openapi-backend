package com.openapi.biz.model.dto.interfaceinfo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class InterfaceInfoAddDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    @NotBlank(message = "接口名称不能为空")
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    @NotBlank(message = "接口地址不能为空")
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
    @Range(min = 0, max = 1, message = "接口状态只能为0或1")
    private Integer status;

    /**
     * 请求类型
     */
    @NotBlank(message = "请求类型不能为空")
    private String method;
}
