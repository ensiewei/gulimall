package com.hsw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsw.common.utils.PageUtils;
import com.hsw.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:10:41
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

