package com.hsw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsw.common.utils.PageUtils;
import com.hsw.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 09:49:18
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

