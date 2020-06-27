package com.hsw.gulimall.coupon.dao;

import com.hsw.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 09:49:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
