package com.hsw.gulimall.order.dao;

import com.hsw.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:37:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
