package com.hsw.gulimall.order.dao;

import com.hsw.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:37:01
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
