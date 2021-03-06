package com.hsw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsw.common.utils.PageUtils;
import com.hsw.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-25 18:50:33
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

