package com.johnny.service;

import com.johnny.pojo.Stock;

/**
 * @author johnny
 * @Classname LockService
 * @Description
 * @Date 2022/9/18 09:29
 */
public interface LockService {
    Stock getStockInfoById(Integer id);
}
