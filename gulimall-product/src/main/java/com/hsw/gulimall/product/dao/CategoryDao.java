package com.hsw.gulimall.product.dao;

import com.hsw.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ensiewei
 * @email ensiewei@gmail.com
 * @date 2020-06-25 18:50:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
