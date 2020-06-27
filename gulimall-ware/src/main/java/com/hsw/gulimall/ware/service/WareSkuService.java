package com.hsw.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsw.common.utils.PageUtils;
import com.hsw.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-27 10:50:26
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

