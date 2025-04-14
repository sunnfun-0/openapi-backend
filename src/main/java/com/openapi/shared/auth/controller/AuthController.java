package com.openapi.shared.auth.controller;

import com.openapi.common.result.Result;
import com.openapi.shared.auth.model.dto.UserRegisterDTO;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.shared.auth.model.dto.UsernameLoginDTO;
import com.openapi.shared.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证控制层
 *
 * @author sunnao
 * @since 2025-04-13
 */
@RestController
@RequestMapping("/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    /**
     * 账号密码注册
     */
    @PostMapping("/register")
    public Result<?> register(@RequestBody @Valid UserRegisterDTO userRegisterDTO) {
        authService.register(userRegisterDTO);
        return Result.success();
    }

    /**
     * 账号密码登录
     *
     * @param usernameLoginDTO 请求参数
     * @return 登录用户信息
     */
    @PostMapping("/login")
    public Result<UserLoginVO> login(@RequestBody @Valid UsernameLoginDTO usernameLoginDTO) {
        UserLoginVO userLoginVO = authService.login(usernameLoginDTO);
        return Result.success(userLoginVO);
    }

    /**
     * 登出
     *
     * @return 登出结果
     */
    @PostMapping("/logout")
    public Result<?> logout() {
        authService.logout();
        return Result.success();
    }
}
