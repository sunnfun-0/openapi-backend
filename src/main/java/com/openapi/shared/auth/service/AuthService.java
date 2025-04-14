package com.openapi.shared.auth.service;

import com.openapi.shared.auth.model.dto.UserRegisterDTO;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.shared.auth.model.dto.UsernameLoginDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    /**
     * 账号密码登录
     *
     * @param usernameLoginDTO 请求参数
     * @return 登录用户信息
     */
    UserLoginVO login(@Valid UsernameLoginDTO usernameLoginDTO);

    /**
     * 账号密码注册
     * @param userRegisterDTO 注册信息
     */
    void register(@Valid UserRegisterDTO userRegisterDTO);

    /**
     * 登出
     */
    void logout();
}
