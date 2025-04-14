package com.openapi.system.controller;

import com.openapi.common.result.Result;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息接口控制层
 *
 * @author sunnao
 * @since 2025-04-13
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 获取登录用户信息
     */
    @GetMapping("/info")
    public Result<UserLoginVO> info() {
        UserLoginVO userLoginVO = userService.getLoginUser();
        return Result.success(userLoginVO);
    }

}
