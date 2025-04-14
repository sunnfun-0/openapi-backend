package com.openapi.biz.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoAddDTO;
import com.openapi.biz.model.entity.InterfaceInfo;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoDetailVO;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoPageVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InterfaceInfoConverter {

    Page<InterfaceInfoPageVO> toPageVO(Page<InterfaceInfo> page);

    InterfaceInfoDetailVO toDetailVO(InterfaceInfo entity);

    InterfaceInfo toEntity(InterfaceInfoAddDTO interfaceInfoAddDTO);
}
