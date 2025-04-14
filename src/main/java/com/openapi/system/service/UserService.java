package com.openapi.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.system.model.entity.User;

/**
 * <p>
 *     用户相关操作
 * </p>
 *
 * @author sunnao
 * @since 2025-04-13
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    User getByUsername(String username);

    /**
     * 获取登录用户信息
     *
     * @return 登录用户信息
     */
    UserLoginVO getLoginUser();
}
