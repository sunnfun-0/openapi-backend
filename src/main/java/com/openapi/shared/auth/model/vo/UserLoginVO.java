package com.openapi.shared.auth.model.vo;

import lombok.Data;

/**
 * 用户登录返回信息
 *
 * @author sunnao
 * @since 2025-04-13
 */
@Data
public class UserLoginVO {

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户简介
     */
    private String profile;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户角色：user/admin/ban
     */
    private String role;
}
