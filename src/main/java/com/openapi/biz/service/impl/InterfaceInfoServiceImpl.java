package com.openapi.biz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.openapi.biz.converter.InterfaceInfoConverter;
import com.openapi.biz.mapper.InterfaceInfoMapper;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoAddDTO;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoPageParamDTO;
import com.openapi.biz.model.entity.InterfaceInfo;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoDetailVO;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoPageVO;
import com.openapi.biz.service.InterfaceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {

    private final InterfaceInfoConverter interfaceInfoConverter;

    /**
     * 构建查询条件
     * @param param 查询参数
     * @return 条件构造器
     */
    private LambdaQueryWrapper<InterfaceInfo> buildQueryWrapper(InterfaceInfoPageParamDTO param) {
        LambdaQueryWrapper<InterfaceInfo> queryWrapper = new LambdaQueryWrapper<>();

        // 根据名称模糊查询
        queryWrapper.like(StrUtil.isNotBlank(param.getName()),
                InterfaceInfo::getName, param.getName());

        // 根据描述模糊查询
        queryWrapper.like(StrUtil.isNotBlank(param.getDescription()),
                InterfaceInfo::getDescription, param.getDescription());

        // 根据状态精确查询
        queryWrapper.eq(param.getStatus() != null,
                InterfaceInfo::getStatus, param.getStatus());

        // 根据请求方法精确查询
        queryWrapper.eq(StrUtil.isNotBlank(param.getMethod()),
                InterfaceInfo::getMethod, param.getMethod());

        // 按创建时间降序排序
        queryWrapper.orderByDesc(InterfaceInfo::getCreateTime);

        return queryWrapper;
    }

    @Override
    public IPage<InterfaceInfoPageVO> getInterfaceInfoPage(InterfaceInfoPageParamDTO param) {

        // 参数构建
        Page<InterfaceInfo> page = param.buildPage();

        // 构建查询条件
        LambdaQueryWrapper<InterfaceInfo> queryWrapper = buildQueryWrapper(param);

        // 执行分页查询
        Page<InterfaceInfo> interfaceInfoPage = page(page, queryWrapper);

        // 转换为VO对象
        return interfaceInfoConverter.toPageVO(interfaceInfoPage);
    }

    @Override
    public InterfaceInfoDetailVO getInterfaceInfoDetail(Long id) {
        InterfaceInfo entity = getById(id);
        if (entity == null) {
            return null;
        }
        return interfaceInfoConverter.toDetailVO(entity);
    }

    @Override
    public Boolean addInterfaceInfo(InterfaceInfoAddDTO interfaceInfoAddDTO) {
        InterfaceInfo entity = interfaceInfoConverter.toEntity(interfaceInfoAddDTO);
        return save(entity);
    }

    @Override
    public Boolean updateInterfaceInfo(InterfaceInfoAddDTO interfaceInfoAddDTO) {
        InterfaceInfo entity = interfaceInfoConverter.toEntity(interfaceInfoAddDTO);
        return updateById(entity);
    }
}




