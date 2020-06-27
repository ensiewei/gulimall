package com.hsw.gulimall.order.dao;

import com.hsw.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:37:03
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
