package com.openapi.system.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.openapi.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *    用户信息表
 * </p>
 *
 * @author sunnao
 * @since 2025-04-13
 */
@EqualsAndHashCode(callSuper = false)
@TableName(value ="sys_user")
@Data
public class User extends BaseEntity {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
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
     * 密码
     */
    private String password;

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

    /**
     * 微信 openid
     */
    private String wxOpenId;

    /**
     * 微信 unionid
     */
    private String wxUnionId;
}