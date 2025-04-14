package com.openapi.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoAddDTO;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoPageParamDTO;
import com.openapi.biz.model.entity.InterfaceInfo;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoDetailVO;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoPageVO;
import jakarta.validation.Valid;

/**
 * <p>
 * 接口表 服务类
 * </p>
 *
 * @author sunnao
 * @since 2025-04-13
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 分页获取接口信息列表
     *
     * @param param 分页查询参数
     * @return 分页结果 {@link InterfaceInfoPageVO}
     */
    IPage<InterfaceInfoPageVO> getInterfaceInfoPage(InterfaceInfoPageParamDTO param);

    /**
     * 获取接口信息详情
     *
     * @param id 接口信息ID
     * @return 接口信息详情 {@link InterfaceInfoDetailVO}
     */
    InterfaceInfoDetailVO getInterfaceInfoDetail(Long id);

    /**
     * 新增接口信息
     *
     * @param interfaceInfoAddDTO 新增接口信息参数
     * @return 是否新增成功
     */
    Boolean addInterfaceInfo(InterfaceInfoAddDTO interfaceInfoAddDTO);

    /**
     * 更新接口信息
     *
     * @param interfaceInfoAddDTO 更新接口信息参数
     * @return 是否更新成功
     */
    Boolean updateInterfaceInfo(@Valid InterfaceInfoAddDTO interfaceInfoAddDTO);
}
