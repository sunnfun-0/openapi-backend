package com.openapi.shared.auth.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjUtil;
import com.openapi.common.exception.BusinessException;
import com.openapi.common.result.ResultCode;
import com.openapi.common.util.PasswordEncoder;
import com.openapi.shared.auth.manager.AuthenticationManager;
import com.openapi.shared.auth.model.dto.UserRegisterDTO;
import com.openapi.shared.auth.model.dto.UsernameLoginDTO;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.shared.auth.service.AuthService;
import com.openapi.system.converter.UserConverter;
import com.openapi.system.model.entity.User;
import com.openapi.system.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;

    private final UserService userService;
    private final UserConverter userConverter;

    @Override
    public UserLoginVO login(UsernameLoginDTO usernameLoginDTO) {
        UserLoginVO userLoginVO = authenticationManager.authenticate(usernameLoginDTO);
        if (ObjUtil.isNotEmpty(userLoginVO)) {
            StpUtil.login(userLoginVO.getId());
        }
        return userLoginVO;
    }

    @Override
    public void register(UserRegisterDTO userRegisterDTO) {
        String username = userRegisterDTO.getUsername();

        Long count = userService.lambdaQuery()
                .eq(User::getUsername, username)
                .count();
        Assert.isTrue(count == 0, "用户名已存在");

        User entity = userConverter.toEntity(userRegisterDTO);
        
        // 使用系统默认加密算法加密密码
        String defaultEncryptPwd = PasswordEncoder.encode(entity.getPassword());
        entity.setPassword(defaultEncryptPwd);

        boolean result = userService.save(entity);

        if (!result) {
            throw new BusinessException(ResultCode.USER_REGISTRATION_ERROR);
        }
    }

    @Override
    public void logout() {
        Long loginId = StpUtil.getLoginId(-1L);
        if (loginId == -1L) {
            return;
        }
        // 登出
        StpUtil.logout(loginId);
    }
}
