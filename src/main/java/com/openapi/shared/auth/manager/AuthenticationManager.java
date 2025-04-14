package com.openapi.shared.auth.manager;

import cn.hutool.core.util.ObjUtil;
import com.openapi.common.exception.BusinessException;
import com.openapi.common.result.ResultCode;
import com.openapi.common.util.PasswordEncoder;
import com.openapi.shared.auth.model.dto.UsernameLoginDTO;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.system.converter.UserConverter;
import com.openapi.system.model.entity.User;
import com.openapi.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AuthenticationManager {

    private final UserService userService;

    private final UserConverter userConverter;

    public UserLoginVO authenticate(UsernameLoginDTO usernameLoginDTO) {
        String username = usernameLoginDTO.getUsername();
        String password = usernameLoginDTO.getPassword();

        // 根据用户名查询系统用户
        User user = userService.getByUsername(username);
        if (ObjUtil.isEmpty(user)) {
            throw new BusinessException(ResultCode.USER_NOT_EXIST);
        }

        if (!PasswordEncoder.matches(password, user.getPassword())) {
            throw new BusinessException(ResultCode.USER_PASSWORD_ERROR);
        }

        return userConverter.toUserLoginVO(user);
    }
}
