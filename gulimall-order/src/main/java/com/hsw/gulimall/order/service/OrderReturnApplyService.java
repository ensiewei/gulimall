package com.hsw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsw.common.utils.PageUtils;
import com.hsw.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:37:02
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

