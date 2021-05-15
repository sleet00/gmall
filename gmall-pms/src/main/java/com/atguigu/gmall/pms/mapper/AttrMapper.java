package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 商品属性
 * 
 * @author hxc
 * @email h_1029384756@163.com
 * @date 2021-05-13 15:25:29
 */
@Mapper
@Repository
public interface AttrMapper extends BaseMapper<AttrEntity> {
	
}
