package com.johnny.service.impl;

import com.alibaba.fastjson.JSON;
import com.johnny.mapper.LockMapper;
import com.johnny.pojo.Stock;
import com.johnny.service.LockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author johnny
 * @Classname LockServiceImpl
 * @Description
 * @Date 2022/9/18 09:29
 */
@Service
@Slf4j
public class LockServiceImpl implements LockService {

    @Autowired
    private LockMapper lockMapper;

    @Override
    public Stock getStockInfoById(Integer id) {
        Stock stock = lockMapper.selectById(id);
        log.info("获取的数据 stock为:{}", JSON.toJSONString(stock));
        return stock;

    }
}
