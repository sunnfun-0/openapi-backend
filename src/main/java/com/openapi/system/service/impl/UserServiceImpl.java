package com.openapi.system.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.ObjUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.system.converter.UserConverter;
import com.openapi.system.mapper.UserMapper;
import com.openapi.system.model.entity.User;
import com.openapi.system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private final UserConverter userConverter;

    @Override
    public User getByUsername(String username) {
        return this.lambdaQuery()
                .eq(User::getUsername, username)
                .one();
    }

    @Override
    public UserLoginVO getLoginUser() {
        Long loginId = StpUtil.getLoginId(-1L);
        if (loginId == -1L) {
            return null;
        }

        User user = this.getById(loginId);
        if (ObjUtil.isNull(user)) {
            return null;
        }
        return userConverter.toUserLoginVO(user);
    }
}




