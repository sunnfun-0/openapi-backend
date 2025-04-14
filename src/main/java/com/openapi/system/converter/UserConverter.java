package com.openapi.system.converter;


import com.openapi.shared.auth.model.dto.UserRegisterDTO;
import com.openapi.shared.auth.model.vo.UserLoginVO;
import com.openapi.system.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConverter {

    User toEntity(UserRegisterDTO userRegisterDTO);

    UserLoginVO toUserLoginVO(User user);
}
