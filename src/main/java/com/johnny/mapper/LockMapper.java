package com.johnny.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.johnny.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author johnny
 * @Classname LockMapper
 * @Description
 * @Date 2022/9/18 09:29
 */
@Mapper
public interface LockMapper extends BaseMapper<Stock> {
}
