package com.openapi.biz.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoAddDTO;
import com.openapi.biz.model.dto.interfaceinfo.InterfaceInfoPageParamDTO;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoDetailVO;
import com.openapi.biz.model.vo.interfaceinfo.InterfaceInfoPageVO;
import com.openapi.biz.service.InterfaceInfoService;
import com.openapi.common.result.PageResult;
import com.openapi.common.result.Result;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 接口信息 控制层
 *
 * @author sunnao
 * @since 2025-04-13
 */
@RestController
@RequestMapping("/interface")
@RequiredArgsConstructor
public class InterfaceInfoController {

    private final InterfaceInfoService interfaceInfoService;

    /**
     * 分页获取接口信息列表
     */
    @GetMapping("/page")
    public PageResult<InterfaceInfoPageVO> interfaceInfoPage(InterfaceInfoPageParamDTO param) {
        IPage<InterfaceInfoPageVO> result = interfaceInfoService.getInterfaceInfoPage(param);
        return PageResult.success(result);
    }

    /**
     * 获取接口信息详情
     */
    @GetMapping("/detail")
    public Result<InterfaceInfoDetailVO> getInterfaceInfoDetail(Long id) {
        InterfaceInfoDetailVO result = interfaceInfoService.getInterfaceInfoDetail(id);
        return Result.success(result);
    }

    /**
     * 新增接口信息
     */
    @PostMapping("/add")
    public Result<Boolean> addInterfaceInfo(@RequestBody @Valid InterfaceInfoAddDTO interfaceInfoAddDTO) {
        Boolean result = interfaceInfoService.addInterfaceInfo(interfaceInfoAddDTO);
        return Result.success(result);
    }

    /**
     * 更新接口信息
     */
    @PutMapping("/update")
    public Result<Boolean> updateInterfaceInfo(@RequestBody InterfaceInfoAddDTO interfaceInfoAddDTO) {
        Boolean result = interfaceInfoService.updateInterfaceInfo(interfaceInfoAddDTO);
        return Result.success(result);
    }

    /**
     * 删除接口信息
     */
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteInterfaceInfo(@PathVariable Long id) {
        Boolean result = interfaceInfoService.removeById(id);
        return Result.success(result);
    }
}
